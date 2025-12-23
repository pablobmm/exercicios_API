package lidando_excecoes;

import lidando_excecoes.excecao.SenhaInvalidaException;

import java.util.Scanner;

public class ex2 {

    //Crie um programa que lê uma senha do usuário.
    // Utilize o bloco try/catch para capturar a
    // exceção SenhaInvalidaException, uma classe de exceção
    // personalizada que deve ser lançada caso a
    // senha não atenda a critérios específicos
    // (por exemplo, ter pelo menos 8 caracteres).

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Login: ");
        String login = leitura.nextLine();
        System.out.println("Senha: ");
        String senha = leitura.nextLine();
        try {
            if (senha.length() < 8){
                throw new SenhaInvalidaException("A senha deve conter pelo menos 8 caracteres");
            }
            System.out.println("Bem vindo " + login);
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }


    }
}
