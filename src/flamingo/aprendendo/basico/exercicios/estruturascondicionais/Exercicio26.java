package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio26 {
    public static void main(String[] args) {

        byte statusPedido = 3;
        String status;

        if (statusPedido == 1) {
            status = "Pedido recebido";

        } else if (statusPedido == 2) {
            status = "Pedido em preparação";

        } else if (statusPedido == 3) {
            status = "Pedido enviado";

        } else if (statusPedido == 4) {
            status = "Pedido entregue";

        } else {
            status = "Status inválido";
        }

        System.out.println(status);
    }
}