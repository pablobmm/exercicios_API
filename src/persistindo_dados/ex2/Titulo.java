package persistindo_dados.ex2;

public class Titulo {
    private String nome;
    private Integer ano;
    private String genero;

    public Titulo(String nome, Integer ano, String genero) {
        this.nome = nome;
        this.ano = ano;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nome: " + nome
                + " Ano: " + ano
                + " Gênero: " + genero;
    }
}
