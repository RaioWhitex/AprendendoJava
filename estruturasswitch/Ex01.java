package flamingo.aprendendo.basico.estruturasswitch;

import java.util.Scanner;

public class Ex01 {
    static void main(String[] args) {
        byte TipoCombustivel;
        double litros,preco;

        Scanner sc =new Scanner(System.in);

        System.out.printf("""
                Qual o tipo de combustivel?
                1) Gasolina
                2) Etanol
                3) Diesel
                """);
        TipoCombustivel= sc.nextByte();
        switch (TipoCombustivel) {
            case 1:
                System.out.println("Quantos litros de gasolina você deseja?");
                litros = sc.nextDouble();
                preco = litros * 5.89;

                System.out.printf("Preço total do combustivel é R$%f", preco);
                break;
            case 2:
                System.out.println("Quantos litros de etanol você deseja?");
                litros = sc.nextDouble();
                preco = litros * 3.99;

                System.out.printf("Preço total do combustivel é R$%f", preco);
                break;
            case 3:
                System.out.println("Quantos litros de diesel você deseja?");
                litros = sc.nextDouble();
                preco = litros * 6.19;

                System.out.printf("Preço total do combustivel é R$%f", preco);
                break;
            default:
                System.out.println("Não existe essa opção!");
                break;
        }
        sc.close();
    }
}
