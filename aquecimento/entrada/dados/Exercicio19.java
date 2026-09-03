package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio19 {
    static void main(String[] args) {

        double numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        numero = sc.nextDouble();

        if (numero < 0) {
            System.out.println("Número negativo.");
        }

        sc.close();
    }
}