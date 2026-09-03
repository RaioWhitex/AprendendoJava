package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio06 {
    static void main(String[] args) {

        double metros, centimetros;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma medida em metros:");
        metros = sc.nextDouble();

        centimetros = metros * 100;

        System.out.printf("%.2f metros equivalem a %.2f centímetros.", metros, centimetros);

        sc.close();
    }
}