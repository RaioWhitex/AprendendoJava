package flamingo.aprendendo.basico;

public class OperadoresParte05 {
    static void main(String[] args) {
        //Operadores de atribuição

        /*
        * = atribuição simples
        * += soma e atribuir
        * -= subtração e atribuir
        * *= multiplicação e atribuição
        * /= divisão e atribuição
        * %= resto da divisão*/

        double totalCompra = 0;

        totalCompra += 50;
        totalCompra += 100;
        totalCompra += 50;

        totalCompra /= 2;

        System.out.printf("Total da compra = %.2f",totalCompra);
    }
}
