package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio22 {
    public static void main(String[] args) {

        double nota = 8.5;
        String conceito;

        if (nota >= 9) {
            conceito = "Excelente";

        } else if (nota >= 7) {
            conceito = "Bom";

        } else if (nota >= 5) {
            conceito = "Recuperação";

        } else {
            conceito = "Reprovado";
        }

        System.out.println(conceito);
    }
}