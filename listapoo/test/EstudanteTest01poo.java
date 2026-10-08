package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Estudantepoo;

import java.util.Scanner;

public class EstudanteTest01poo {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Estudantepoo EstudanteTest01poo = new Estudantepoo();

        System.out.println("Qual o nome do estudante? ");
        String nome = sc.nextLine();
        EstudanteTest01poo.nome = nome;

        System.out.println("Digite a idade do estudante: ");
        int idade = Integer.parseInt(sc.nextLine());
        EstudanteTest01poo.idade = idade;


        System.out.println("Digite o sexo do aluno? ");
        String sexo = sc.nextLine();
        EstudanteTest01poo.sexo = sexo;

        System.out.println("-----------------------------");

        System.out.printf("""
                nome: %s
                idade: %d
                sexo: %s
                """,EstudanteTest01poo.nome, EstudanteTest01poo.idade, EstudanteTest01poo.sexo);


    }

}
