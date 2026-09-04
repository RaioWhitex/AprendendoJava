package flamingo.aprendendo.basico.repetição;

public class Exercicio04 {
    static void main(String[] args) {
        int soma = 0;
        for (int contador = 1; contador <= 100; contador++) {
            soma += contador;
        }
        System.out.println("A soma de 1 até 100 é: " + soma);
    }
}
