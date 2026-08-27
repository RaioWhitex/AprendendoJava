package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio13 {
    static void main(String[] args) {

        double saldo = 300.00;
        double produtos = 400.00;

        String efetuacaodecompra;

        if (saldo > produtos) {
            efetuacaodecompra = "Compra Aprovada";
        }else {
            efetuacaodecompra = "Saldo insuficiente";
        }
        System.out.println(efetuacaodecompra);
    }
}
