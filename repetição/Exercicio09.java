package flamingo.aprendendo.basico.repetição;

import java.util.Scanner;

public class Exercicio09 {
    static void main(String[] args) {
        int tentativa1;
        int tentativa2;
        int tentativa3;
        System.out.println("Faça seu login");

        Scanner sc=new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        System.out.println("Qual sua senha? ");
        tentativa1 = sc.nextInt();

        System.out.println("Qual seu nome? ");
        System.out.println("Qual sua senha? ");
        tentativa2 = sc.nextInt();

        System.out.println("Qual seu nome? ");
        System.out.println("Qual sua senha? ");
        tentativa3 = sc.nextInt();

        System.out.println("Número máximo de tentativas atingido");

    }
}
