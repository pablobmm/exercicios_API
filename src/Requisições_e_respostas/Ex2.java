package Requisições_e_respostas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Crie um programa Java que utiliza as classes HttpClient,
        // HttpRequest e HttpResponse para fazer uma consulta à API
        // CoinGecko e exiba a cotação atual de uma criptomoeda escolhida pelo usuário.

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma criptomoeda para a cotação: ");
        var cripto = leitura.nextLine();

        var criptoBusca = cripto.replace(" ", "+");

        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptoBusca + "&vs_currencies=usd";
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}