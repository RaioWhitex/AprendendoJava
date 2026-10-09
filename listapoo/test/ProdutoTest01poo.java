package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Produtopoo;

import java.util.Scanner;

public class ProdutoTest01poo {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Produtopoo ProdutoTest01poo = new Produtopoo ();

        System.out.println("Qual o nome do produto? ");
        ProdutoTest01poo.nome = sc.nextLine();

        System.out.println("Qual o preço do produto? ");
        ProdutoTest01poo.preco = sc.nextDouble();

        System.out.println("Qual a quantidade? ");
        ProdutoTest01poo.quantidade = sc.nextInt();

        System.out.printf("""
                nome: %s
                preço: %f
                quantidade: %d
                """,ProdutoTest01poo.nome, ProdutoTest01poo.preco, ProdutoTest01poo.quantidade);

    }
}
