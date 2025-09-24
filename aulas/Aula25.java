//Data: __/__/__
//Conteúdo: pilha

package aulas;
import utils.IO;
import java.util.Stack;

public class Aula25 {

    public static void aula(){
        System.out.println("\n\n\n===========================================");
        IO.imprimir("\n\n\n## Aula 25 - Pilha ##\n\n\n");
    
        //Exercício 01
        polonesaReversa("15 7 1 1 + - / 3 * 2 1 1 + + -");

    }
    
    public static void polonesaReversa(String expressao){
        Stack<String> pilha = new Stack<>();

        String[] tokens = expressao.split(" ");
        String token;
        int resultado = 0;
        int contador = 1;

        System.out.println("Expressão: " + expressao);

        IO.divisoria();
        for (int i = 0; i < tokens.length; i++) {

            token = tokens[i];

            if(ehOperador(token)){
                if (pilha.size() < 2) {
                    System.out.println("Expressão inválida");
                    return;
                }

                int b = Integer.parseInt(pilha.pop());
                int a = Integer.parseInt(pilha.pop());

                switch (token) {
                    case "+":
                        System.out.println("Passo " + contador + ": " + a + " + " + b  );
                        resultado = a + b;
                        contador++;
                        break;
                    case "-":
                        System.out.println("Passo " + contador + ": " + a + " - " + b  );
                        resultado = a - b;
                        contador++;

                        break;

                    case "*":
                        System.out.println("Passo " + contador + ": " + a + " x " + b  );
                        resultado = a * b;
                        contador++;

                        break;
                    case "/":
                        if (b == 0) {
                            System.out.println("ERROR: Divided by zero");
                            return;
                        }

                        System.out.println("Passo " + contador + ": " + a + " / " + b  );
                        resultado = a / b;
                        contador++;

                        break;
                }
                pilha.push(Integer.toString(resultado));
            } else {
                pilha.push(token);
            }
        }
        IO.divisoria();
        System.out.println("Resultado: " + resultado);
    }

    public static boolean ehOperador(String mesage){
//       conferir: +               conferir: -          conferir: *            conferir: /
        if ("+".equals(mesage) || "-".equals(mesage) || "*".equals(mesage) || "/".equals(mesage) ) {
            return true;
        }
                
    
                
        return false;

    }
    
    

}