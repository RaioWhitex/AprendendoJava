package faccatJaison;

import java.util.Scanner;

public class Exercício06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa Eleitores");
        System.out.println("Digite o total de eleitores");
        int totaleleitores = sc.nextInt();
        System.out.println("Digite o número de votos brancos: ");
        int votosbrancos = sc.nextInt();
        System.out.println("Digite o número de votos nulos: ");
        int votosnulos = sc.nextInt();
        System.out.println("Digite o total de votos válidos: ");
        int votosvalidos = sc.nextInt();

        double percentualBrancos = votosbrancos * 100.0/totaleleitores;
        double percentualNulos = votosnulos * 100.0/totaleleitores;
        double percentualValidos = votosvalidos * 100.0/totaleleitores;

        System.out.println("O percentual de votos brancos são: " + percentualBrancos);
        System.out.println("O percentual de votos nulos são: " + percentualNulos);
        System.out.println("O percentual de votos válidos são: " + percentualValidos);
    }

}
