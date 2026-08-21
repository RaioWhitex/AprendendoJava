package flamingo.aprendendo.introducao;

public class Exercicio {
    /* Eu <nome> morando no endereço <endereço>, confirmo o sálario de <sálario> na data <data>*/
    static void main(String[] args) {
        //Definições
        String nome = "Gustavo Steferson";
        String endereço = "São Paulo, SP";
        float salario = 1700.00f;
        short dia = 05;
        String mes = "Agosto";
        //Respostas
        System.out.println("Eu, " + nome + ", morando em: " + endereço +
                ". confirmo o sálario de: " + salario + " na data " + dia +
                " no mês de " + mes);
    }
}
