package flamingo.aprendendo.introducao;

public class TiposPrimitivos {

    public static void main(String[] args) {
        //byte: -128 até 127
        //short: -32.768 até 32.767
        //int: -2B até 2B
        //long: Para números inteiros muito grandes (usa um L no final do número)
        //float: Precisão simples (usa um f no final, ex: 5.5f)
        //double: Precisão dupla, sendo o padrão para decimais no java
        //char: Guarda uma unica letra ou simbolo em formato unicode (ex: 'G')
        //boolean: Guarda apenas dois valores: true (verdadeiro) e false (falso)
        short idade = 18;
        int municipio = 114000000;
        long contabancaria = 999999999999999999L;
        float salario = 15000.66f;
        double salarioextra = 25000.50;
        char primeiraletradonome = 'G';
        boolean vaiestudarnasferias = false;
        System.out.println(vaiestudarnasferias);
        System.out.println("Primeira Letra do meu nome: " + primeiraletradonome);
        System.out.println("PL caiu: " + salarioextra);
        System.out.println("Meu salário depois de estudar com o bigas: " + salario);
        System.out.println("Minha idade é " + idade);
        System.out.println("São Paulo (SP): Mais de " + municipio + " Milhões de Moradores.");
        System.out.println("Minha conta bancária daqui a 5 anos " + contabancaria);
    }
}