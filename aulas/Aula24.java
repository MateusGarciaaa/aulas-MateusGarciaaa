//Data: 22/09/2025
//Conteúdo: Pilhas

package aulas;
import java.util.Stack;

import utils.IO;

public class Aula24 {

    public static void aula(){
        System.out.println("\n\n\n===========================================");
        IO.imprimir("\n\n\n## Aula 24 - Pilhas ##\n\n\n");
    
        //Exercício 01
        //ex01();
        //Exercício 02
        ex02();
    }
    
    public static void ex01(){

        Stack<Integer> pilha = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        while (!pilha.isEmpty()) {
            int valor = pilha.pop();
            System.out.println(valor);
        }

    }

    public static void ex02(){
        Stack<String> pilha = new Stack<>();

        String expressao = "( { [ ] } )";
        String[] tokens = expressao.split(" ");
        String token, token_pop;

        for (int i = 0; i < tokens.length; i++) {
            token = tokens[i];
            
            if (ehAbrir(token)) {
                pilha.push(token);
            
            } else{

                if (pilha.isEmpty()) {
                    System.out.println("Expressão inválida");
                    return;
                }
                token_pop = pilha.pop();

                if (!verificarPar(token_pop, token)) {
                    System.out.println("Expressao inválida!!!");
                    return;
                }

            }

        }
        if (pilha.isEmpty()) {
            System.out.println("Expressão válida");
        } else{
            System.out.println("Expressão inválida");
        }

    }
    
    public static boolean verificarPar(String abre, String fecha){
        // ()
        if (abre.equals("(") && fecha.equals(")")) {
            return true;
        }

        // []
        if (abre.equals("[") && fecha.equals("]")) {
            return true;
        }
        
        // {}
        if (abre.equals("{") && fecha.equals("}")) {
            return true;
        }

        return false;
    }


    public static boolean ehAbrir(String abre){
        // ()
        if (abre.equals("(")) {
            return true;
        }
        
        // []
        if (abre.equals("[" )) {
            return true;
        }
                
        // {}
        if (abre.equals("{")) {
            return true;
        }
        
        return false;
    }
}