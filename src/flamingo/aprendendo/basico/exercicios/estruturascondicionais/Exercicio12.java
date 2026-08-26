package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio12 {
    static void main(String[] args) {

        byte nota = 5;
        String Classificacao;

        if (nota>=7) {
            Classificacao = "Aprovado";
        } else {
            Classificacao = "Reprovado";
        }

        System.out.println(Classificacao);
    }
}
