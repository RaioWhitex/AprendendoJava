package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio14 {
    static void main(String[] args) {

        boolean emailcorreto = true;
        boolean senhacorreto = true;

        String resultao;

        if (emailcorreto && senhacorreto){
            resultao = "Login realizado com sucesso.";
        }else {
            resultao = "Email ou senha inválidos.";
        }
        System.out.println(resultao);
    }
}
