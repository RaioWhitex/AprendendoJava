package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio35 {
    static void main(String[] args) {

        int xp;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de XP do jogador:");
        xp = sc.nextInt();

        if (xp < 1000) {
            System.out.println("Iniciante.");
        } else if (xp < 5000) {
            System.out.println("Intermediário.");
        } else if (xp < 10000) {
            System.out.println("Avançado.");
        } else {
            System.out.println("Lendário.");
        }

        sc.close();
    }
}