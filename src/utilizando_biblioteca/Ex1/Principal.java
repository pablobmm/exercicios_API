package utilizando_biblioteca.Ex1;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    //Crie uma classe Pessoa usando o conceito
    // de Record em Java, com atributos
    // como nome, idade e cidade. Em seguida,
    // implemente um programa que utiliza
    // a biblioteca Gson para converter um
    // JSON representando uma pessoa em um
    // objeto do tipo Pessoa.
    public static void main(String[] args) {
        String json = """
                {
                "nome" : "Roberto",
                "idade" : 43,
                "cidade" : "Rio de Janeiro"
                }
                
                """;
        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);
    }
}
