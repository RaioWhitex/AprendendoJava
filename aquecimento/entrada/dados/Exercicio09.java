package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio09 {
    static void main(String[] args) {

        double celsius, fahrenheit;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Celsius:");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("A temperatura em Fahrenheit é %.2f°F.", fahrenheit);

        sc.close();
    }
}