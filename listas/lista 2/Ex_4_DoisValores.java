import java.util.Scanner;

public class Ex_4_DoisValores {
    
 

    public static void imprimir (String texto){
        System.out.println(texto);
    }

    public static Scanner tecladoScanner = new Scanner(System.in);


    public static int lerValorInteiro(){
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;

    }

    public static void processar ( int inicio, int fim){
        int i;
        String texto;

        for( i = inicio; i <= fim; i = i+1){
            texto = "" + i;

            //saida
            imprimir(texto);
        }

    }



    public static void main(String[] args) {
        int inicio = 0;
        int fim = 0;

        imprimir("Digite um valor de inicio");
        inicio = lerValorInteiro();
        imprimir("Digite um valor de fim");
        fim = lerValorInteiro();

        imprimir("\nOs números do intevalo são:");

        processar(inicio, fim);
    }


    }

