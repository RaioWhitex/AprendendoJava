package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio23 {
    public static void main(String[] args) {

        double salario = 3500;
        String faixaSalarial;

        if (salario <= 1500) {
            faixaSalarial = "Salário baixo";

        } else if (salario <= 3000) {
            faixaSalarial = "Salário médio";

        } else if (salario <= 7000) {
            faixaSalarial = "Salário bom";

        } else {
            faixaSalarial = "Salário alto";
        }

        System.out.println(faixaSalarial);
    }
}