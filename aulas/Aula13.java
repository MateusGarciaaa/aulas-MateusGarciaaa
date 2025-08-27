package aulas;

import utils.IO;

public class Aula13 {
    public static void aula(){
        
    }

    public static void main(String[] args) {
        int[][] matrizUm = {
            {9,8,2},
            {7,4,5}
        };

        int[][] matrizDois = {
            {7, 3},
            {4, 1},
            {0, 6}
        };

        int [][] matrizMultiplicada = IO.multiplicarMatrizes(matrizUm, matrizDois);

        IO.imprimirMatriz(matrizMultiplicada);
    }
}
