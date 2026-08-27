package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio30 {
    public static void main(String[] args) {

        byte tipoCliente = 3;
        double valorCompra = 1000;
        double desconto;

        if (tipoCliente == 1) {
            desconto = 0;

        } else if (tipoCliente == 2) {
            desconto = 0.05;

        } else if (tipoCliente == 3) {
            desconto = 0.10;

        } else if (tipoCliente == 4) {
            desconto = 0.15;

        } else {
            desconto = 0;
        }

        double valorFinal = valorCompra - (valorCompra * desconto);

        System.out.println("Valor final: R$" + valorFinal);
    }
}