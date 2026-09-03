package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio15 {
    static void main(String[] args) {

        double temperatura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura atual:");
        temperatura = sc.nextDouble();

        if (temperatura > 30) {
            System.out.println("Está muito quente hoje.");
        }

        sc.close();
    }
}