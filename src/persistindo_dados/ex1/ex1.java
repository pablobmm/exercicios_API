package persistindo_dados.ex1;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class ex1 {
    //Crie um programa em Java que escreva
    // a seguinte mensagem em
    // um arquivo chamado "arquivo.txt":
    // "Conteúdo a ser gravado no arquivo."
    // Utilize as classes do pacote java.io.
    public static void main(String[] args) throws IOException, InterruptedException {
        String texto = "Conteúdo a ser gravado no arquivo.";
        try {
            FileWriter escrita = new FileWriter("arquivo.txt");
            escrita.write(texto);
            escrita.close();
        }catch (IIOException e){
            e.printStackTrace();
        }
    }
}
