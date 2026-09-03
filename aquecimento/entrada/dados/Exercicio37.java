package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio37 {
    static void main(String[] args) {

        double valorCompra, desconto, valorFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        valorCompra = sc.nextDouble();

        if (valorCompra <= 100) {
            desconto = 0;
        } else if (valorCompra <= 300) {
            desconto = valorCompra * 0.05;
        } else if (valorCompra <= 500) {
            desconto = valorCompra * 0.10;
        } else {
            desconto = valorCompra * 0.15;
        }

        valorFinal = valorCompra - desconto;

        System.out.printf("""
                Valor original: R$%.2f
                Desconto: R$%.2f
                Valor final: R$%.2f
                """, valorCompra, desconto, valorFinal);

        sc.close();
    }
}