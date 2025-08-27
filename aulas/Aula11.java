package aulas;
import utils.VETORES;
import utils.IO;

public class Aula11 {

    public static void aula() {
        ex30();
    }

    public static void ex30(){
        int[] vetor_entrada = {1,2,3,1,4,0,3,9};
        int[] vetor_saida = VETORES.removerRepetidos(vetor_entrada);

        VETORES.imprimirVetor(vetor_saida);

    }
}
