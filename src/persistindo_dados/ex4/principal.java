package persistindo_dados.ex4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.sql.SQLOutput;

public class principal {
    //Defina uma classe chamada Veiculo com
    // os atributos necessários. Em seguida,
    // crie um programa que instancia um objeto
    // Veiculo, serializa esse objeto para JSON
    // usando a biblioteca Gson e imprime o resultado.
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Veiculo veiculo = new Veiculo("VW","Golf",2020);
        String json = gson.toJson(veiculo);
        System.out.println("Objeto java");
        System.out.println(veiculo);
        System.out.println("serialização do objeto");
        System.out.println(json);
    }
}
