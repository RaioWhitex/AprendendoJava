package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio42 {
    public static void main(String[] args) {

        double saldo = 500;
        double valorProduto = 700;
        boolean clienteVip = true;

        String resultado;

        if (saldo >= valorProduto) {
            resultado = "Compra aprovada";

        } else if (clienteVip) {
            resultado = "Compra aprovada pelo crédito VIP";

        } else {
            resultado = "Compra recusada";
        }

        System.out.println(resultado);
    }
}