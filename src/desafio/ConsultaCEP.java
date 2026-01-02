package desafio;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCEP {

    public Endereco buscarEndereco(String cep) {

        String busca = "http://viacep.com.br/ws/" + cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(busca))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(),Endereco.class);
        } catch (Exception e) {
            throw new RuntimeException("não foi possível receber o endereço");
        }
    }
}