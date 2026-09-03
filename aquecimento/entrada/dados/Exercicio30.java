package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio30 {
    static void main(String[] args) {

        String senha;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha:");
        senha = sc.nextLine();

        if (senha.equals("java123")) {
            System.out.println("Acesso liberado.");
        } else {
            System.out.println("Senha incorreta.");
        }

        sc.close();
    }
}