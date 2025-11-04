//Data: 03/11/2025
//Conteúdo: MergeSort

package aulas;
import utils.IO;
import utils.VETORES;

public class Aula30 {

    public static void aula(){
        System.out.println("\n\n\n===========================================");
        IO.imprimir("\n\n\n## Aula 30 - MergeSort ##\n\n\n");
    
        //Exercício 01
        // ex01();
        //Exercício 02
        ex02();

    }
    
    public static void ex01(){
        int[] vetorUm = {0,2,3,4,6};
        int[] vetorDois = {1,5,7,8};

        System.out.print("Vetor Um: ");
        VETORES.imprimirVetor(vetorUm);

        System.out.print("Vetor Dois: ");
        VETORES.imprimirVetor(vetorDois);
        
        int[] vetorResultado = IO.mergeSort_intercalar(vetorUm, vetorDois);
        VETORES.imprimirVetor(vetorResultado);
    }

    
    public static void ex02(){
        int[] vetor = {4,1,7,0,8,5,2,9,6,3};
        int[] vetorResposta = IO.mergeSort_rec(vetor);

        System.out.println("Vetor: ");
        VETORES.imprimirVetor(vetor);

        System.out.println("Vetor ordenado: ");
        VETORES.imprimirVetor(vetorResposta);

    }

}