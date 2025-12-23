package lidando_excecoes;

import java.util.Scanner;

public class ex1 {
    //Crie um programa simples que
    // solicita dois números ao usuário e
    // realiza a divisão do primeiro pelo segundo.
    // Utilize o bloco try/catch para tratar
    // a exceção que pode ocorrer caso o
    // usuário informe 0 como divisor.

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("digite o primeiro número para a divisão: ");
        double num1 = leitura.nextDouble();
        System.out.println("digite o segundo número: ");
        double num2 = leitura.nextDouble();
        try {
            if (num2 == 0) {
                throw new ArithmeticException("Divisão por zero");
            }
            System.out.println("o resultado: " + num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }


}
