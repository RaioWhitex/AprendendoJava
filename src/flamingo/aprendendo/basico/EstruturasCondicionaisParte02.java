package flamingo.aprendendo.basico;

public class EstruturasCondicionaisParte02 {
    static void main(String[] args) {
//
//        byte idade = 18;
//
//        if(idade >=18) {
//            System.out.println("Pode comprar bebida alcoólica");
//
//        }else {
//            System.out.println("Não pode comprar bebida alcoólica");
//        }

        byte idade = 18;
        String categoria;

        // < 15 - infantil
        // >= 15 && <18 - juvenil
        // >= 18 - adulto

        if (idade<15) {
            categoria = "Categoria Infantil";

        }else if(idade >=15 && idade <18) {
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);
    }
}
