package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio16 {
    static void main(String[] args) {

        double ValorCompra = 200;

        if (ValorCompra >=200) {
            ValorCompra = ValorCompra * 0.90;
        }
        System.out.println("Valor final = R$" + ValorCompra);
    }
}
