package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio36 {
    static void main(String[] args) {

        double peso, altura, imc;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        peso = sc.nextDouble();

        System.out.println("Digite sua altura:");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Peso normal.");
        } else if (imc < 30) {
            System.out.println("Sobrepeso.");
        } else {
            System.out.println("Obesidade.");
        }

        sc.close();
    }
}