package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio11 {
    static void main(String[] args) {

        byte idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        idade = sc.nextByte();

        if (idade >= 18) {
            System.out.println("Entrada permitida.");
        }

        sc.close();
    }
}