 /*10. Algoritmo eleição - Elabore um algoritmo em fluxograma que leia a idade de uma pessoa e
informe a sua classe eleitoral:
• não eleitor (abaixo de 16 anos);
• eleitor obrigatório (entre a faixa de 18 e menor de 65 anos);
• eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive).*/

import java.util.Scanner;

public class Ex_10_Eleição {
   
    // METODO QUE IMPRIME
    public static void imprimir(String texto){
        System.out.println(texto);
    }

    //METODO QUE RECEBE UM VALOR DIGITADO
    public static Scanner tecladoScanner = new Scanner (System.in);

    //METODO QUE RECEBE UM VALOR INT
    public static int lerValorInt(){
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }
    
    public static void main(String[] args) {
       
        //DEFINICAO DE VARIAVEIS    
        int idade = 0;
        String classe = null;
        String saida;
        

        //RECEBER VALOR
        imprimir("Qual é a sua idade?");
        idade = lerValorInt();

        //PROCEDIMENTO
        if (  idade >= 65 || idade >= 16 && idade < 18  ) {
            classe = "facultativo";            
        }else if (  idade >= 18  ) {
            classe = "obrigatório";
        }else{
            classe = "não eleitor";
        }

        saida = "Sua classe eleitoral é: " + classe;

        imprimir(saida);


    }









}

