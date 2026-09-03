package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio16 {
    static void main(String[] args) {

        double velocidade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a velocidade do veículo:");
        velocidade = sc.nextDouble();

        if (velocidade > 80) {
            System.out.println("Você foi multado.");
        }

        sc.close();
    }
}