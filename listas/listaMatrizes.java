package listas;
import utils.IO;

public class listaMatrizes{

    public static void exercicios(){

        // ex01();
        // ex02();
        // ex03();
        // ex04();
        // ex05();
        // ex06();
        // ex07();
        // ex08();
        // ex09();
        // ex10();
        // ex11();
        // ex12();
        // ex13();
        // ex14();
        // ex15();
        // ex16();
        // ex17();
        // ex18();
        // ex19();
        // ex20();
        // ex21();
        // ex22();
        // ex23();

    }

    public static void ex01(){
        int [][] matriz = new int[7][7];

        for(int linha = 0; linha < matriz.length; linha ++){
    
            for(int coluna = 0; coluna < matriz[0].length; coluna++){
                if (linha == 0) {
                    System.out.print("1 ");
                }
                if (linha != coluna ) {
                    System.out.print("9 ");
                }
            }
        }


    }
    public static void ex02() {
        // int matriz [][] = new int[3][3];
        // O PRIMEIRO [] REPRESENTA A LINHA
        // O SEGUNDO  [] REPRESENTA A LINHA

        int [][] matriz = new int[4][4];
        int contador = 0;
        for(int linha = 0; linha < matriz.length; linha ++){

            for(int coluna = 0; coluna < matriz[0].length; coluna ++){

                matriz [linha][coluna] = IO.lerValorInteiro(""); 
            }

        }
        
        for(int linha = 0; linha < matriz.length; linha ++){

            for(int coluna = 0; coluna < matriz[0].length; coluna ++){

                if(matriz [linha][coluna] < 10){
                    contador++;
                } 

            }
        }

        IO.imprimirValorInteiro(contador);
        
    }




    public static int[][] ex04(int linha, int coluna){
        int[][] m = new int[linha][coluna];

        for(int i = 0; i < linha; i++){
            for(int j = 0; j< coluna; j++){
                IO.imprimir("Digite o valor presente na linha " + (linha + 1) + " e coluna " + (coluna + 1));
                m[i][j] = IO.lerValorInteiro();
            }
        }
        return m;
    }

    public static void ex05(){
        //encontrarValor();
    }

    public static void ex06(){
        int[][]matriz ={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20}
        };

        IO.imprimirMatriz(permutacaoMatriz(matriz));
    }












    public static void encontrarPosicaoValor(int [][] matriz, int valor){
        int contador = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; i < matriz[0].length; j++){
                if(matriz[i][j] == valor){
                    IO.imprimir("O valor esta presente na posição\n linha: " + i + "\n coluna: " + j);
                    contador = 1;
                }
            }
        }
        if(contador == 0){
            IO.imprimir("valor não encontrado");
        }
    }

    public static int[][] permutacaoMatriz(int[][]matriz){
        int[][] matrizNova = new int [matriz.length][matriz[0].length];

        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[0].length; coluna++){
                matrizNova[linha][coluna] = matriz[linha][coluna];
            }
        }

        for(int coluna = 0; coluna < matriz[0].length; coluna++){
            matrizNova[1][coluna] = matriz[3][coluna];
            matrizNova[3][coluna] = matriz[1][coluna];            
        }

        return matrizNova;
    }


}