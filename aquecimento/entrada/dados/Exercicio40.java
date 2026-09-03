package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio40 {
    static void main(String[] args) {

        double totalGasto;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o total gasto pelo cliente no mês:");
        totalGasto = sc.nextDouble();

        if (totalGasto <= 100) {
            System.out.println("Cliente comum.");
        } else if (totalGasto <= 500) {
            System.out.println("Cliente bronze.");
        } else if (totalGasto <= 1000) {
            System.out.println("Cliente prata.");
        } else {
            System.out.println("Cliente ouro.");
        }

        sc.close();
    }
}