//Data: 10/11/2025
//Conteúdo: CountingSort

package aulas;
import utils.IO;

public class Aula31{

    public static void aula(){
        System.out.println("\n\n\n===========================================");
        IO.imprimir("\n\n\n## Aula 31 - CountingSort ##\n\n\n");
    
        //Exercício 01
        ex01();

    }
    
    public static void ex01(){
        int[] vetor = {7,5,7,2,3,5,7,0,2};
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;


        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        int[] count = new int[10];
        int[] index = new int[count.length];

        for (int i = 0; i < vetor.length; i++) {
                        
        }



        int contador;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != vetor[i-1]|| i == 0) {
                contador = 0;
            }

        }


    }

    
    

}