package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio17 {
    static void main(String[] args) {

        double valorCompra;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        valorCompra = sc.nextDouble();

        if (valorCompra >= 100) {
            System.out.println("Cliente ganhou desconto.");
        }

        sc.close();
    }
}