package flamingo.aprendendo.basico.aquecimento.entrada.dados;

import java.util.Scanner;

public class Exercicio41 {
    static void main(String[] args) {

        byte idade;
        String mensagem;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        idade = sc.nextByte();

        mensagem = idade >= 18 ? "Maior de idade." : "Menor de idade.";

        System.out.println(mensagem);

        sc.close();
    }
}