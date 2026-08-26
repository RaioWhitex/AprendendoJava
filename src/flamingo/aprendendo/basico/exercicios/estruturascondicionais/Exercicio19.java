package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio19 {
    public static void main(String[] args) {

        double valorCompra = 130.00;

        boolean IsFreteGratis = valorCompra >= 150;

        if (IsFreteGratis)
            System.out.println("Frete grátis.");
        else {
            System.out.println("Frete de R$20,00.");
        }
    }
}
