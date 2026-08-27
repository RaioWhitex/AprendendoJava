package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio33 {
    public static void main(String[] args) {

        double saldo = 1000;
        double valorProduto = 750;

        String resultado = saldo >= valorProduto ? "Compra aprovada" : "Saldo insuficiente";

        System.out.println(resultado);
    }
}