package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio01 {
    static void main(String[] args) {

        String nome, cidade;
        byte idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = sc.nextLine();

        System.out.println("Digite sua idade:");
        idade = sc.nextByte();
        sc.nextLine();

        System.out.println("Digite sua cidade:");
        cidade = sc.nextLine();

        System.out.printf("Meu nome é %s, tenho %d anos e moro em %s.", nome, idade, cidade);

        sc.close();
    }
}