package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio49 {
    static void main(String[] args) {

        byte tipoCombustivel;
        double litros, preco = 0, valorTotal;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                Escolha o combustível:
                1) Gasolina - R$5,80
                2) Etanol - R$4,20
                3) Diesel - R$6,00
                """);

        tipoCombustivel = sc.nextByte();

        System.out.println("Digite a quantidade de litros:");
        litros = sc.nextDouble();

        switch (tipoCombustivel) {
            case 1:
                preco = 5.80;
                break;

            case 2:
                preco = 4.20;
                break;

            case 3:
                preco = 6.00;
                break;

            default:
                System.out.println("Tipo de combustível inválido.");
                break;
        }

        if (tipoCombustivel >= 1 && tipoCombustivel <= 3) {
            valorTotal = litros * preco;

            System.out.printf("Valor total a pagar: R$%.2f", valorTotal);
        }

        sc.close();
    }
}