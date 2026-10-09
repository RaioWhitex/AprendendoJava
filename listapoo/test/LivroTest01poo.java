package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Livropoo;

import java.util.Scanner;

public class LivroTest01poo {
    static void main(String[] args) {
        Livropoo livro01 = new Livropoo();
        Livropoo livro02 = new Livropoo();

        livro01.titulo = "Gato de botas";
        livro01.autor = "Joao";
        livro01.numeroPaginas = 200;
        livro01.preco = 200.50;

        livro02.titulo = "O gigante";
        livro02.autor = "pedro";
        livro02.numeroPaginas = 200;
        livro02.preco = 200.50;

        System.out.printf("""
                Livro01:
                Titulo: %s
                Autor: %s
                Numero de Páginas: %d
                Preço: %f
                -----------------------------------
                Livro02:
                Titulo: %s
                Autor: %s
                Numero de Páginas: %d
                Preço: %f
                """,livro01.titulo, livro01.autor, livro01.numeroPaginas,livro01.preco,livro02.titulo,livro02.autor,livro02.numeroPaginas,livro02.preco);


    }
}
