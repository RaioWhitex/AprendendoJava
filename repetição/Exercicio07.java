package flamingo.aprendendo.basico.repetição;

import java.util.Scanner;

public class Exercicio07 {
    static void main(String[] args) {
        int qtdvendas;
        Scanner sc=new Scanner(System.in);
        System.out.println("Quantas vendas teve? ");
        qtdvendas = sc.nextInt();
        System.out.println("Quantidade de vendas: " + qtdvendas + " Faturamento total: R$" + qtdvendas * 50);
        }
    }
