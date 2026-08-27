package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio44 {
    public static void main(String[] args) {

        boolean emailCorreto = true;
        boolean senhaCorreta = true;
        boolean contaAtiva = true;

        String resultado;

        if (emailCorreto && senhaCorreta && contaAtiva) {
            resultado = "Login realizado";

        } else if (!emailCorreto || !senhaCorreta) {
            resultado = "Dados inválidos";

        } else {
            resultado = "Conta bloqueada";
        }

        System.out.println(resultado);
    }
}