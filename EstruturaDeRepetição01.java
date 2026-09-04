package flamingo.aprendendo.basico;

import java.util.Scanner;

public class EstruturaDeRepetição01 {
    static void main(String[] args) {

        System.out.println("Escolhe seu número");
        int numero;
        Scanner sc= new Scanner(System.in);
        numero= sc.nextInt();

        for (int contador = 0; contador <=10; contador++) {
            System.out.println(contador*numero);
        }

    }
}
