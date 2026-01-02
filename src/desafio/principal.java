package desafio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o cep: ");
        var cep = scanner.nextLine();

        try {
            ConsultaCEP consultaCEP = new ConsultaCEP();
            Endereco endereco = consultaCEP.buscarEndereco(cep);
            System.out.println(endereco);
            Gravador_de_arquivos gravador = new Gravador_de_arquivos();
            gravador.armazenaJson(endereco);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}