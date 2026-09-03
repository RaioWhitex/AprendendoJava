package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio24 {
    static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }

        sc.close();
    }
}