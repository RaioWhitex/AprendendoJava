package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Carro;

public class CarroTest01poo {
    static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Civic";
        carro01.modelo = "Honda";
        carro01.ano = 1999;

        carro02.nome = "Ford";
        carro02.modelo = "Honda";
        carro02.ano = 1999;

        System.out.printf("""
                carro01:
                nome: %s
                modelo: %s
                ano: %d
                --------------------------------
                carro02:
                nome: %s
                modelo: %s
                ano: %d
                """,carro01.nome, carro01.modelo, carro01.ano, carro02.nome, carro02.modelo, carro02.ano);
    }

}
