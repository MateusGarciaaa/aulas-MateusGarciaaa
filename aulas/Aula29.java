//Data: 20/10/2025
//Conteúdo: HashSet

package aulas;
import java.util.HashMap;
import utils.IO;

public class Aula29{

    public static void aula(){
        System.out.println("\n\n\n===========================================");
        IO.imprimir("\n\n\n## Aula 29 - Exercício HashMap ##\n\n\n");
    
        //Exercício 01
        ex01();


        //Exercício 02
        ex02();

    }
    

    // HashSet
    public static void ex01(){
        int contador = IO.contagemPalavrasDistintas("a a a a a a a b c d e");
        System.out.println("Contagem de palavras distintas: " + contador);
    }

    // HashMap
    public static void ex02(){
        HashMap<String, Integer> palavras = IO.contagemDePalavras("a a a a a a a a a a b b b c c d e e e e f g g g g g ");
        System.out.println(palavras);
    }
    

}