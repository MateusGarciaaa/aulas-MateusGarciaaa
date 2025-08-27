package utils;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IO {
    final static Scanner tecladoScanner = new Scanner(System.in);

    public static void hello(){
        System.out.println("Hello");
    }


    public static void imprimir(String texto){
        System.out.println(texto);
    }

    
    public static int lerValorInteiro(String solicitacao){
        System.out.print(solicitacao);
        int valor = tecladoScanner.nextInt();
        return valor;
    }
    
    public static int lerValorInteiro(){
        int valor = tecladoScanner.nextInt();
        return valor;
    }

    //Leitura de um valor double
    public static double LerValorDouble(){
        double valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static void imprimirValorInteiro(int valor){
        imprimir("" + valor);
    }

    public static void imprimirValorDouble(double valor){
        imprimir("" + valor);
    }

    // METODO QUE LE UM VALOR CHAR
    public static char lerValorChar(){
        String entrada = tecladoScanner.next();
        return entrada.charAt(0);
    }
    
    // METODO QUE LE UM VALOR STRING
    public static String lerValorString(String solicitacao){
        System.out.print("\n" + solicitacao);
        String entrada = tecladoScanner.nextLine();
        return entrada;
    }


    public static String lerPalavra(String mensagem) {
        System.out.println(mensagem);
        String valor = tecladoScanner.next();
        return valor;
    }


    public static void imprimirMatriz(int [][] matriz){
        for(int idx = 0; idx < matriz.length; idx++){
            VETORES.imprimirVetor(matriz[idx]);
        }
    }

    public static int[][] somarMatriz(int[][]matrizUm, int [][]matrizDois){
        int [][] matrizSoma = new int [matrizUm.length][matrizUm[0].length];

        for(int linha = 0; linha<matrizUm.length; linha++){
            for(int coluna = 0; coluna<matrizUm[linha].length; coluna++){
                matrizSoma[linha][coluna] = matrizUm[linha][coluna] + matrizDois[linha][coluna];

            }
        }
        return matrizSoma;
    }
    
    public static int[][] multiplicarMatrizPorInteiro(int[][]matriz, int x){
        int [][] a = new int [matriz.length][matriz[0].length];

        for(int linha = 0; linha<matriz.length; linha++){
            for(int coluna = 0; coluna<matriz[linha].length; coluna++){
                a[linha][coluna] = matriz[linha][coluna] * x;

            }
        }
        return a;
    }

public static int[][] multiplicarMatrizes(int[][]matrizUm, int[][]matrizDois){
        int[][]matrizMult = new int[matrizUm.length][matrizDois[0].length];
        
        for(int linhas = 0; linhas < matrizUm.length; linhas++){
            for(int colunas = 0; colunas < matrizDois[0].length; colunas++){
               int acumulador = 0;
                for(int qtdSomas = 0; qtdSomas<matrizDois.length; qtdSomas++){
                    acumulador += matrizUm[linhas][qtdSomas] * matrizDois[qtdSomas][colunas];
                }
                matrizMult[linhas][colunas] = acumulador;
            }
        }
        return matrizMult;
    }


    public static boolean palindromo(String mensagem){
        int inicio = 0;
        int fim = mensagem.length()-1;

        while(inicio <= fim){
            if(mensagem.charAt(inicio)!= mensagem.charAt(fim)){
                return false;
            }
            inicio++;
            fim--;
        }
        return true;


    }

    public static void limparBuffer(){
        tecladoScanner.nextLine();



    }



    public static void fecharScanner(){
        tecladoScanner.close();
    }

    public static void imprimirErro(String texto){
        System.err.println(texto);

    }

}

