package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio18 {
    public static void main(String[] args) {

        int numero = 1;

        boolean IsNumeroParouImpar = numero % 2 == 0;

        if (IsNumeroParouImpar)
            System.out.println("Número Par");
        else {
            System.out.println("Número Ímpar");
        }
    }
}