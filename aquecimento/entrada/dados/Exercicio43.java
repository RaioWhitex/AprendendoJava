package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio43 {
    static void main(String[] args) {

        int numero;
        String resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        numero = sc.nextInt();

        resultado = numero % 2 == 0 ? "Número par." : "Número ímpar.";

        System.out.println(resultado);

        sc.close();
    }
}