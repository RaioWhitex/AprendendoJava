package flamingo.aprendendo.basico;

public class OperadoresParte03 {
    static void main(String[] args) {
    /*
    * && And -> E
    * || Or -> Ou
    * ! Not -> Não
    * */

    byte idade = 126;
    boolean IsCNH = true;

    boolean isEstanalei = idade >= 18 && IsCNH;
    System.out.println(isEstanalei);

    }
}
