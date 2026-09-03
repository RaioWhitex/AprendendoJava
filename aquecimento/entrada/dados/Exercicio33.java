package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio33 {
    static void main(String[] args) {

        double salario;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário:");
        salario = sc.nextDouble();

        if (salario <= 1500) {
            System.out.println("Salário baixo.");
        } else if (salario <= 3000) {
            System.out.println("Salário médio.");
        } else if (salario <= 7000) {
            System.out.println("Salário bom.");
        } else {
            System.out.println("Salário alto.");
        }

        sc.close();
    }
}