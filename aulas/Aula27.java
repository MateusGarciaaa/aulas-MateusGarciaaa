//Data: 15/10/2025
//Conteúdo: Pesquisa Binária

package aulas;
import utils.IO;

public class Aula27 {

    public static void aula(){
        System.out.println("\n\n\n===========================================");
        IO.imprimir("\n\n\n## Aula 27 - Pesquisa Binária ##\n\n\n");
    
        //Exercício 01
        ex01();

    }
    
    public static void ex01(){

        int[] vetor = {2,4,6,8,10,12,14,16,18,20};
        int valor = 16;
        System.out.println("Valor desejado: " + valor);
        System.out.println("Pesquisa Binária Recursiva: " + IO.pesquisaBinariaRecursiva(vetor, valor, 0, vetor.length));

    }

    
    
    
}