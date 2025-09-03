//Data: 01/09/2025

package avaliacoes.trabalhos.T3;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import utils.IO;

public class tesouro {

    public static void exercicios(){
        ex01();
    }

    public static void ex01(){

        //Variaveis
        FileReader file_reader = null;
        Scanner reader = null;
        int qtdLinhas;
        int qtdColunas;
        int posicaoInicalLinha;
        int posicaoInicalColuna;
        Posicao posicao = new Posicao();        


        try {
            file_reader = new FileReader("entrada/mapa.txt");
            reader = new Scanner(file_reader);
            
        } catch (Exception e) {
            IO.imprimirErro("Erro ao abrir o arquivo");
            e.printStackTrace();
        }

        //Pegar a quantidade de linhas e colunas do arquivo
        qtdLinhas = reader.nextInt();
        qtdColunas = reader.nextInt();
        
        //Criação da Matriz
        Posicao[][] matriz = new Posicao[qtdLinhas][qtdColunas];


        //Pegar a posição inicial
        posicaoInicalLinha = reader.nextInt();
        posicaoInicalColuna = reader.nextInt();

        
        //Teste   
        System.out.println("Quantidade de linhas: " + qtdLinhas + "\nQuantidade de colunas: " + qtdColunas + "\nPosição inicial linha: " + posicaoInicalLinha + "\nPosição inicial coluna: " + posicaoInicalColuna);





        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                //Lê os valores em cada posição
                matriz[linha][coluna] = new Posicao();
                matriz[linha][coluna].linha = reader.nextInt();
                matriz[linha][coluna].coluna = reader.nextInt();

            }
        }
        System.out.println("a");

        // for (int i = 0; i < matriz.length; i++) {
        //     for (int j = 0; j < matriz[0].length; j++) {
        //         System.out.println(matriz[i][j]);
        //     }
        // }








        // FECHAMENTO DO ARQUIVO
        try {
            file_reader.close();            
            reader.close();
            
        } catch (IOException e) {
            IO.imprimirErro("Erro ao abrir o arquivo");
            e.printStackTrace();
        }
    }

    public static boolean conferirRepeticao(int[] vetor){


        int primeiroValor;
        int segundoValor;
        for(int i = 0; i < vetor.length; i+= 2){
            primeiroValor = vetor[i];
            segundoValor = vetor[i+1];
            for (int j = i; j < vetor.length; j++) {
                if (primeiroValor == vetor[j] && segundoValor == vetor[j+1]) {
                    return false;
                }
            }
        }

        return true;
    }


}