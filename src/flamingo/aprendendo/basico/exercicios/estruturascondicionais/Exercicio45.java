package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio45 {
    public static void main(String[] args) {

        double valorCompra = 600;
        double porcentagemDesconto;

        if (valorCompra <= 100) {
            porcentagemDesconto = 0;

        } else if (valorCompra <= 300) {
            porcentagemDesconto = 5;

        } else if (valorCompra <= 500) {
            porcentagemDesconto = 10;

        } else {
            porcentagemDesconto = 15;
        }

        double valorDesconto = valorCompra * porcentagemDesconto / 100;
        double valorFinal = valorCompra - valorDesconto;

        System.out.println("Valor original: R$" + valorCompra + "\nPorcentagem de desconto: " + porcentagemDesconto + "%" + "\nValor do desconto: R$" + valorDesconto + "\nValor final da compra: R$" + valorFinal);
//        System.out.println("Porcentagem de desconto: " + porcentagemDesconto + "%");
//        System.out.println("Valor do desconto: R$ " + valorDesconto);
//        System.out.println("Valor final da compra: R$ " + valorFinal);
    }
}