package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio08 {
    static void main(String[] args) {

        double numero, dobro, metade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        numero = sc.nextDouble();

        dobro = numero * 2;
        metade = numero / 2;

        System.out.printf("Dobro: %.2f%nMetade: %.2f", dobro, metade);

        sc.close();
    }
}