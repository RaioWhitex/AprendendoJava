package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio25 {
    static void main(String[] args) {

        byte idade;
        boolean CNH;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        idade = sc.nextByte();

        System.out.println("Você possui CNH? Digite true ou false:");
        CNH = sc.nextBoolean();

        if (idade >= 18 && CNH) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir.");
        }

        sc.close();
    }
}