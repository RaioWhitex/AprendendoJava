package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio14 {
    static void main(String[] args) {

        int quantidade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos no estoque:");
        quantidade = sc.nextInt();

        if (quantidade > 0) {
            System.out.println("Produto disponível para venda.");
        }

        sc.close();
    }
}