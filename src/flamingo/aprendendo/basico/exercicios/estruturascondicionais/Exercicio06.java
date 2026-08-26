package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio06 {
    static void main(String[] args) {

        boolean UsuarioLogado = true;
        if (UsuarioLogado)
            System.out.println("Bem vindo ao sistema");
        else {
            System.out.println("Sem permissão");
        }
    }
}
