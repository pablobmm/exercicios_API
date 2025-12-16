package utilizando_biblioteca.Ex3;

import com.google.gson.Gson;

public class Principal {
    //Crie uma classe Livro que
    // contenha atributos como título, autor
    // e um objeto representando a editora.
    // Em seguida, implemente um programa
    // que utiliza a biblioteca Gson para
    // converter um JSON aninhado
    // representando um livro em
    // um objeto do tipo Livro.
    public static void main(String[] args) {
        String json = """
                {
                    "titulo" : "A república",
                    "autor" : "Platao",
                    "editora": {
                        "nome": "Edipro",
                        "cidade": "São Paulo"
                    }
                }
                """;
        Gson gson = new Gson();
        Livro livro = gson.fromJson(json, Livro.class);
        System.out.println(livro);
    }
}
