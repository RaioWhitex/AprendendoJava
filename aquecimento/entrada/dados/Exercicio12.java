package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio12 {
    static void main(String[] args) {

        double nota;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno:");
        nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Aluno aprovado.");
        }

        sc.close();
    }
}