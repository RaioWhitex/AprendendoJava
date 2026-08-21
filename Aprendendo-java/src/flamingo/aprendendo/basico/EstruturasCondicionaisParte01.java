package flamingo.aprendendo.basico;

public class EstruturasCondicionaisParte01 {
    static void main(String[] args) {

        byte idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // true
        if (isAutorizadoComprarBebida) {

            System.out.println("Pode comprar bebida alcoólica");
        }
    }
}