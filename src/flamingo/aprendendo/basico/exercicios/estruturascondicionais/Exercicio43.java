package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio43 {
    public static void main(String[] args) {

        byte idade = 18;
        boolean temCarteirinhaEstudante = true;

        String resultado;

        if (idade < 12) {
            resultado = "Paga meia";

        } else if (temCarteirinhaEstudante) {
            resultado = "Paga meia";

        } else {
            resultado = "Paga inteira";
        }

        System.out.println(resultado);
    }
}