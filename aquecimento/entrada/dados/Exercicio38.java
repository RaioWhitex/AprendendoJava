package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio38 {
    static void main(String[] args) {

        double nota, presenca;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno:");
        nota = sc.nextDouble();

        System.out.println("Digite a porcentagem de presença:");
        presenca = sc.nextDouble();

        if (nota >= 7 && presenca >= 75) {
            System.out.println("Aprovado.");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }
}