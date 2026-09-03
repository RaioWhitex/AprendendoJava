package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio02 {
    static void main(String[] args) {

        String nome;
        byte idade;
        double notaFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        nome = sc.nextLine();

        System.out.println("Digite a idade do aluno:");
        idade = sc.nextByte();

        System.out.println("Digite a nota final:");
        notaFinal = sc.nextDouble();

        System.out.printf("O aluno %s tem %d anos e sua nota final foi %.2f.", nome, idade, notaFinal);

        sc.close();
    }
}