package persistindo_dados.ex2e3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class principal {
    //2- Defina uma classe chamada Titulo
    // com os atributos necessários.
    // Em seguida, crie um programa
    // que instancia um objeto Titulo,
    // serializa esse objeto para JSON
    // usando a biblioteca Gson e imprime o resultado.

    // 3 - Modifique o programa anterior
    // para que o JSON gerado seja formatado
    // de maneira mais elegante.
    // Utilize o método setPrettyPrinting
    //  para alcançar esse resultado.
    public static void main(String[] args) {
        Titulo meuTitulo = new Titulo("Up",2009,"Animação");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(meuTitulo);
        System.out.println("Objeto Java");
        System.out.println(meuTitulo);
        System.out.println("Objeto serializado para Json");
        System.out.println(json);
    }
}
