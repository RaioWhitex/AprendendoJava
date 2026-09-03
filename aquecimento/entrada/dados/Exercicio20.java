package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio20 {
    static void main(String[] args) {

        boolean logado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Você está logado? Digite true ou false:");
        logado = sc.nextBoolean();

        if (logado) {
            System.out.println("Bem-vindo ao sistema.");
        }

        sc.close();
    }
}