package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio32 {
    static void main(String[] args) {

        double nota;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno:");
        nota = sc.nextDouble();

        if (nota >= 9) {
            System.out.println("Excelente.");
        } else if (nota >= 7) {
            System.out.println("Bom.");
        } else if (nota >= 5) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }
}