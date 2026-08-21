package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio11 {
    static void main(String[] args) {

        byte idade = 18;
        String Classificacao;

        if (idade>=18) {
            Classificacao = "Maior de idade";
        }else {
            Classificacao = "Menor de idade";
        }
        System.out.println(Classificacao);
    }
}
