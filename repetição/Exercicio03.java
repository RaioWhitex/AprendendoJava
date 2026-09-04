package flamingo.aprendendo.basico.repetição;

import java.util.Scanner;

public class Exercicio03 {
    static void main(String[] args) {
        int numero;
        System.out.println("Escolha um número: ");
        Scanner sc=new Scanner(System.in);
        numero= sc.nextInt();

        int contador =1;
        while (contador<=10) {
            System.out.println(contador + "X" + numero+ "="+contador*numero);

            contador++;
        }
    }
}
