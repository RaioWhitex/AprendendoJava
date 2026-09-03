package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio10 {
    static void main(String[] args) {

        String nome, cargo;
        double salario;
        boolean ativo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        nome = sc.nextLine();

        System.out.println("Digite o cargo do funcionário:");
        cargo = sc.nextLine();

        System.out.println("Digite o salário do funcionário:");
        salario = sc.nextDouble();

        System.out.println("O funcionário está ativo? Digite true ou false:");
        ativo = sc.nextBoolean();

        System.out.printf("""
                Nome: %s
                Cargo: %s
                Salário: R$%.2f
                Funcionário ativo: %b
                """, nome, cargo, salario, ativo);

        sc.close();
    }
}