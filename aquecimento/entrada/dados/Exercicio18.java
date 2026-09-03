package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio18 {
    static void main(String[] args) {

        double presenca;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a porcentagem de presença do aluno:");
        presenca = sc.nextDouble();

        if (presenca >= 75) {
            System.out.println("Presença suficiente.");
        }

        sc.close();
    }
}