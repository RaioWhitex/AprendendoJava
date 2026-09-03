package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio47 {
    static void main(String[] args) {

        byte opcao;
        int quantidade;
        double preco = 0, valorTotal;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                Cardápio:
                1) Hambúrguer - R$25,00
                2) Pizza - R$40,00
                3) Salada - R$18,00
                4) Refrigerante - R$8,00
                """);

        System.out.println("Escolha uma opção:");
        opcao = sc.nextByte();

        System.out.println("Digite a quantidade:");
        quantidade = sc.nextInt();

        switch (opcao) {
            case 1:
                preco = 25;
                break;
            case 2:
                preco = 40;
                break;
            case 3:
                preco = 18;
                break;
            case 4:
                preco = 8;
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        if (opcao >= 1 && opcao <= 4) {
            valorTotal = preco * quantidade;

            System.out.printf("Valor total do pedido: R$%.2f", valorTotal);
        }

        sc.close();
    }
}