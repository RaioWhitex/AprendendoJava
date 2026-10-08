package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Professorpoo;

import java.util.Scanner;

public class ProfessorTest01poo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professorpoo ProfessorTest01poo = new Professorpoo();

        System.out.println("Qual o nome do professor? ");
        String nome = sc.nextLine();
        ProfessorTest01poo.nome = nome;

        System.out.println("Qual a idade do professor? ");
        int idade = Integer.parseInt(sc.nextLine());
        ProfessorTest01poo.idade = idade;

        System.out.println("Qual disciplina do professor? ");
        String disciplina = sc.nextLine();
        ProfessorTest01poo.disciplina = disciplina;

        System.out.println("Qual o salario do professor? ");
        double salario = Double.parseDouble(sc.nextLine());
        ProfessorTest01poo.salario = salario;

        System.out.println("-----------------------------");

        System.out.printf("""
                nome: %s
                idade: %d
                disciplina: %s
                salario: %.2f
                """,ProfessorTest01poo.nome,ProfessorTest01poo.idade,ProfessorTest01poo.disciplina,ProfessorTest01poo.salario);
    }
}
