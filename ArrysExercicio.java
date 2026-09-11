package flamingo.aprendendo.basico;

public class ArrysExercicio {
    static void main(String[] args) {
        int[][] numeros = new int[12][31];

        numeros[0][0] = 1;
        numeros[0][1] = 2;


        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = j + 1;
                System.out.println(numeros[i][j]);
                }
            }
        }
    }