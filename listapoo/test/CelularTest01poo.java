package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Celularpoo;

import java.util.Scanner;

public class CelularTest01poo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Celularpoo CelularTest01poo = new Celularpoo();

        System.out.println("Qual a marca do celular? ");
        String marca = sc.nextLine();
        CelularTest01poo.marca = marca;

        System.out.println("Qual o modelo do celular? ");
        String modelo = sc.nextLine();
        CelularTest01poo.modelo = modelo;

        System.out.println("Qual o armazenamento do celular? ");
        int armazenamento = sc.nextInt();
        CelularTest01poo.armazenamento = armazenamento;

        System.out.println("Qual o preço do celular? ");
        double preco = sc.nextDouble();
        CelularTest01poo.preco = preco;

        System.out.printf("""
                Marca: %s
                Modelo: %s
                Armazenamento: %d
                Preço: %f
                """, CelularTest01poo.marca, CelularTest01poo.modelo, CelularTest01poo.armazenamento, CelularTest01poo.preco);


    }
}
