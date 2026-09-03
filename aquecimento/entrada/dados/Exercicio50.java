package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio50 {
    static void main(String[] args) {

        byte plano;
        int meses;
        String nomePlano = "";
        double valorMensal = 0, valorSemDesconto, desconto, valorFinal;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                Planos:
                1) Básico - R$29,90 por mês
                2) Intermediário - R$59,90 por mês
                3) Premium - R$99,90 por mês
                """);

        System.out.println("Escolha o plano:");
        plano = sc.nextByte();

        System.out.println("Digite a quantidade de meses:");
        meses = sc.nextInt();

        switch (plano) {
            case 1:
                nomePlano = "Básico";
                valorMensal = 29.90;
                break;

            case 2:
                nomePlano = "Intermediário";
                valorMensal = 59.90;
                break;

            case 3:
                nomePlano = "Premium";
                valorMensal = 99.90;
                break;

            default:
                System.out.println("Plano inválido.");
                break;
        }

        if (plano >= 1 && plano <= 3) {

            valorSemDesconto = valorMensal * meses;

            if (meses >= 12) {
                desconto = valorSemDesconto * 0.10;
            } else {
                desconto = 0;
            }

            valorFinal = valorSemDesconto - desconto;

            System.out.printf("""
                    Nome do plano: %s
                    Valor mensal: R$%.2f
                    Quantidade de meses: %d
                    Valor sem desconto: R$%.2f
                    Valor do desconto: R$%.2f
                    Valor final do contrato: R$%.2f
                    """,
                    nomePlano,
                    valorMensal,
                    meses,
                    valorSemDesconto,
                    desconto,
                    valorFinal);
        }

        sc.close();
    }
}