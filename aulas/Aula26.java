//Data: 13/10/2025
//Conteúdo: Recursividade

package aulas;
import java.util.LinkedList;

import utils.IO;

public class Aula26 {

    public static void aula(){
        System.out.println("\n\n\n===========================================");
        IO.imprimir("\n\n\n## Aula 26 - Recursividade ##\n\n\n");
    
        //Exercício 01
        ex01();



    }
    
    public static void ex01(){
        int numero = IO.multiplicarSemMultiplicacao(0, 3);
        System.out.println("Resultado: "+numero);


        System.out.println("====== fatorial =======");
        int a = IO.fatorial(4);
        System.out.println("Resultado: " + a);

        int fibonnaci = IO.fibonacciRecursivo(9);
        System.out.println("====== fibonnaci ======\n" + "resultado = " + fibonnaci);
        
    }

    
    

}