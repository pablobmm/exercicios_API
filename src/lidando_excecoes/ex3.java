package lidando_excecoes;

import lidando_excecoes.excecao.ErroConsultaGitHubException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ex3 {
    //Desenvolva um programa em Java
    // que permite aos usuários consultar
    // informações sobre um usuário do GitHub
    // (utilize a API pública do GitHub para
    // obter os dados). Crie uma classe de
    // exceção personalizada,
    // ErroConsultaGitHubException, que estende
    // RuntimeException. Lance essa exceção
    // quando o nome de usuário não
    // for encontrado. No bloco catch,
    // trate de forma específica essa exceção,
    // exibindo uma mensagem amigável.
    public static void main(String[] args) {
        try {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite o nome do usuário: ");
            String usuario = leitura.nextLine();
            String endereco = "https://api.github.com/users/" + usuario;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
            }
            String json = response.body();
            System.out.println(json);

        } catch (ErroConsultaGitHubException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro de conexão com a API.");
        }
    }
}
