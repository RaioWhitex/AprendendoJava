package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio28 {
    public static void main(String[] args) {

        byte plano = 2;
        String assinatura;

        if (plano == 1) {
            assinatura = "Plano Básico - R$ 29,90";

        } else if (plano == 2) {
            assinatura = "Plano Intermediário - R$59,90";

        } else if (plano == 3) {
            assinatura = "Plano Premium - R$99,90";

        } else {
            assinatura = "Plano inválido";
        }

        System.out.println(assinatura);
    }
}