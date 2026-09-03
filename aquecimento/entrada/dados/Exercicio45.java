package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio45 {
    static void main(String[] args) {

        double salario, bonus, valorTotal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário:");
        salario = sc.nextDouble();

        bonus = salario < 3000 ? 500 : 200;

        valorTotal = salario + bonus;

        System.out.printf("""
                Salário: R$%.2f
                Bônus: R$%.2f
                Valor total: R$%.2f
                """, salario, bonus, valorTotal);

        sc.close();
    }
}