package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio24 {
    public static void main(String[] args) {

        double temperatura = 28;
        String classificacao;

        if (temperatura < 15) {
            classificacao = "Frio";

        } else if (temperatura <= 25) {
            classificacao = "Agradável";

        } else if (temperatura <= 35) {
            classificacao = "Quente";

        } else {
            classificacao = "Muito quente";
        }

        System.out.println(classificacao);
    }
}