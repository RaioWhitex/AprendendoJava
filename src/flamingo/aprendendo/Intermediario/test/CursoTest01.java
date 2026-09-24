package flamingo.aprendendo.Intermediario.test;

import flamingo.aprendendo.Intermediario.dominio.Curso;
import flamingo.aprendendo.Intermediario.dominio.Estudante;

import java.util.Scanner;

public class CursoTest01 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Curso curso = new Curso();

        System.out.println("Digite o nome do curso: ");
        String nome = sc.nextLine();
        curso.nome = nome;

        System.out.println("Digite o a duração da faculdade: ");
        int duracaoanos = Integer.parseInt(sc.nextLine());
        curso.duracaoanos = duracaoanos;

        System.out.println("Digite a mensalidade: ");
        double mensalidade = Double.parseDouble(sc.nextLine());
        curso.mensalidade = mensalidade;

        System.out.println("Digite o modelo do curso: ");
        String modelo = sc.nextLine();
        curso.modelo = modelo;

        System.out.println("Digite o turno do curso: ");
        String turno = sc.nextLine();
        curso.turno = turno;

        System.out.println("Todos os dados:");
        System.out.println(curso.nome);
        System.out.println(curso.duracaoanos);
        System.out.println(curso.mensalidade);
        System.out.println(curso.modelo);
        System.out.println(curso.turno);
    }

}
