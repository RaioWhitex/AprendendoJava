package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio07 {
    static void main(String[] args) {

        double valorHora, horasTrabalhadas, salarioBruto;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quanto você ganha por hora:");
        valorHora = sc.nextDouble();

        System.out.println("Digite quantas horas você trabalhou no mês:");
        horasTrabalhadas = sc.nextDouble();

        salarioBruto = valorHora * horasTrabalhadas;

        System.out.printf("Seu salário bruto é R$%.2f.", salarioBruto);

        sc.close();
    }
}