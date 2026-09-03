package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio03 {
    static void main(String[] args) {

        short anoNascimento;
        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento:");
        anoNascimento = sc.nextShort();

        idade = 2026 - anoNascimento;

        System.out.printf("Sua idade aproximada é %d anos.", idade);

        sc.close();
    }
}