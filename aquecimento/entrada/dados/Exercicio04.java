package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio04 {
    static void main(String[] args) {

        String produto;
        double valorUnitario, valorTotal;
        int quantidade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        produto = sc.nextLine();

        System.out.println("Digite o valor unitário:");
        valorUnitario = sc.nextDouble();

        System.out.println("Digite a quantidade comprada:");
        quantidade = sc.nextInt();

        valorTotal = valorUnitario * quantidade;

        System.out.printf("Produto: %s%nValor total da compra: R$%.2f", produto, valorTotal);

        sc.close();
    }
}