package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio42 {
    static void main(String[] args) {

        double nota;
        String resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno:");
        nota = sc.nextDouble();

        resultado = nota >= 7 ? "Aprovado." : "Reprovado.";

        System.out.println(resultado);

        sc.close();
    }
}