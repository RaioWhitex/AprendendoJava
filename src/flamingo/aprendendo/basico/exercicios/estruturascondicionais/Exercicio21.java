package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio21 {
    public static void main(String[] args) {

        byte idade = 18;
        String classificacao;

        if (idade < 12) {
            classificacao = "Criança";

        } else if (idade >= 12 && idade <= 17) {
            classificacao = "Adolescente";

        } else if (idade >= 18 && idade <= 59) {
            classificacao = "Adulto";

        } else {
            classificacao = "Idoso";
        }

        System.out.println(classificacao);
    }
}