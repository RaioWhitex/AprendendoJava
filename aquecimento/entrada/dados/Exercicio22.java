package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio22 {
    static void main(String[] args) {

        double notaFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota final do aluno:");
        notaFinal = sc.nextDouble();

        if (notaFinal >= 7) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }
}