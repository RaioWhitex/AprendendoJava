package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio27 {
    public static void main(String[] args) {

        byte codigoProduto = 2;
        String categoria;

        if (codigoProduto == 1) {
            categoria = "Eletrônico";

        } else if (codigoProduto == 2) {
            categoria = "Alimento";

        } else if (codigoProduto == 3) {
            categoria = "Roupa";

        } else if (codigoProduto == 4) {
            categoria = "Livro";

        } else {
            categoria = "Categoria inválida";
        }

        System.out.println(categoria);
    }
}