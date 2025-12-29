package persistindo_dados.ex2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class principal {
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
