package aulas;
import utils.IO;
//Data: 30/07/2025
//Conteúdo: Matrizes

public class Aula12 {

    public static void aula(){

        ex01();
        // ex02();

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

                matriz [linha][coluna] = IO.lerValorInteiro(); 
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


}
