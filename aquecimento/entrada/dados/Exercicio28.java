package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio28 {
    static void main(String[] args) {

        double saldo, valorSaque, saldoRestante;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo da conta:");
        saldo = sc.nextDouble();

        System.out.println("Digite o valor que deseja sacar:");
        valorSaque = sc.nextDouble();

        if (valorSaque <= saldo) {
            saldoRestante = saldo - valorSaque;

            System.out.println("Saque realizado com sucesso.");
            System.out.printf("Saldo restante: R$%.2f", saldoRestante);
        } else {
            System.out.println("Saldo insuficiente.");
        }

        sc.close();
    }
}