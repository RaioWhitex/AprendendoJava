package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio17 {
    public static void main(String[] args) {

        byte idade = 18;
        boolean CNH = false;

        boolean IsPermissaoParaDirigr = idade >= 18 && CNH;

        if (IsPermissaoParaDirigr)
            System.out.println("Pode dirigir");
        else {
            System.out.println("Não pode dirigir");
        }
    }
}