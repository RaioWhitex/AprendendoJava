package flamingo.aprendendo.Intermediario.test;

import flamingo.aprendendo.Intermediario.dominio.Estudante;

import java.util.Scanner;

public class EstudanteTest01 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Estudante estudante = new Estudante();

        System.out.println("Digite o nome do estudante: ");
        String nome = sc.nextLine();
        estudante.nome = nome;

        System.out.println("Digite a duração do curso: ");
        int idade = Integer.parseInt(sc.nextLine());
        estudante.idade = idade;

        System.out.println("Digite o RG do estudante: ");
        String rg = sc.nextLine();
        estudante.rg = rg;

        System.out.println("Digite o telefone do estudante: ");
        String tel = sc.nextLine();
        estudante.tel = tel;

        System.out.println("Digite o curso do estudante: ");
        String curso = sc.nextLine();
        estudante.curso = curso;

//        estudante.nome = "Gustavo";
//        estudante.idade = 18;
//        estudante.rg = "00.000.000-00";
//        estudante.tel = "(11)93391-4350";
//        estudante.curso = "ADS";

        System.out.println("Todos os dados:");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.rg);
        System.out.println(estudante.tel);
        System.out.println(estudante.curso);
    }
}
