package utilizando_biblioteca.Ex2;

import com.google.gson.Gson;

public class Principal {
   //Modifique o programa do Exercício
   // anterior para permitir a conversão
   // de um JSON mesmo se alguns campos
   // estiverem ausentes ou se
   // houver campos adicionais não
   // representados no objeto Pessoa.
   // Consulte a documentação da biblioteca Gson
   // para flexibilizar a conversão.
    public static void main(String[] args) {
        String json = """
                {
                "nome" : "Roberto",
                "idade" : 43,
               
                "profissao" : ""
                }
                
                """;
        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);
    }
}
