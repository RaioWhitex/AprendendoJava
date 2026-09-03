package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio31 {
    static void main(String[] args) {

        byte idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        idade = sc.nextByte();

        if (idade < 12) {
            System.out.println("Criança.");
        } else if (idade <= 17) {
            System.out.println("Adolescente.");
        } else if (idade <= 59) {
            System.out.println("Adulto.");
        } else {
            System.out.println("Idoso.");
        }

        sc.close();
    }
}