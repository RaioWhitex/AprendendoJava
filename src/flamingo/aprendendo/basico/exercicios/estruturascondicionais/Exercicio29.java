package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio29 {
    public static void main(String[] args) {

        double imc = 23.5;
        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";

        } else if (imc <= 24.9) {
            classificacao = "Peso normal";

        } else if (imc <= 29.9) {
            classificacao = "Sobrepeso";

        } else {
            classificacao = "Obesidade";
        }

        System.out.println(classificacao);
    }
}