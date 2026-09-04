package flamingo.aprendendo.basico.repetição;

import java.util.Scanner;

public class Exercicio08 {
    static void main(String[] args) {
        double valorproduto;
        int qtd;
        Scanner sc =new Scanner(System.in);
        System.out.println("Qual a quantidade? ");
        qtd = sc.nextInt();
        System.out.println("Qual o valor do produto? ");
        valorproduto = sc.nextInt();

        System.out.println("Quantidade de vendas: " + qtd + " Valor de cada produto R$" + valorproduto + " Total da compra: " + (qtd*valorproduto));
    }
}
