package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio13 {
    static void main(String[] args) {

        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo da conta:");
        saldo = sc.nextDouble();

        if (saldo > 0) {
            System.out.println("Você possui saldo disponível.");
        }

        sc.close();
    }
}