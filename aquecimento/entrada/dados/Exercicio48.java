package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio48 {
    static void main(String[] args) {

        byte opcao;
        double numero1, numero2, resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        numero1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        numero2 = sc.nextDouble();

        System.out.printf("""
                Escolha uma operação:
                1) Soma
                2) Subtração
                3) Multiplicação
                4) Divisão
                """);

        opcao = sc.nextByte();

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.printf("Resultado: %.2f", resultado);
                break;

            case 2:
                resultado = numero1 - numero2;
                System.out.printf("Resultado: %.2f", resultado);
                break;

            case 3:
                resultado = numero1 * numero2;
                System.out.printf("Resultado: %.2f", resultado);
                break;

            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.printf("Resultado: %.2f", resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }

        sc.close();
    }
}