package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio44 {
    static void main(String[] args) {

        double valorCompra, frete;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        valorCompra = sc.nextDouble();

        frete = valorCompra >= 150 ? 0 : 20;

        System.out.printf("Valor do frete: R$%.2f", frete);

        sc.close();
    }
}