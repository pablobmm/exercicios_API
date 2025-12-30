package persistindo_dados.ex4;

public class Veiculo {
    private String marca;
    private String modelo;
    private Integer ano;

    public Veiculo(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo: "  +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano= " + ano
                ;
    }
}
