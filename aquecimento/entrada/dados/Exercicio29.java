package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio29 {
    static void main(String[] args) {

        double valorCompra, valorFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        valorCompra = sc.nextDouble();

        if (valorCompra >= 200) {
            valorFinal = valorCompra - (valorCompra * 0.10);
        } else {
            valorFinal = valorCompra;
        }

        System.out.printf("Valor final da compra: R$%.2f", valorFinal);

        sc.close();
    }
}