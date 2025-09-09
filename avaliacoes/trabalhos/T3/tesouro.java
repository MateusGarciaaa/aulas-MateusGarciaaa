//Data: 01/09/2025

package avaliacoes.trabalhos.T3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import utils.IO;

public class tesouro {

    public static void exercicios() {
        ex01();
    }

    public static void ex01() {

        // Variaveis
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

        // Pegar a quantidade de linhas e colunas do arquivo
        qtdLinhas = reader.nextInt();
        qtdColunas = reader.nextInt();

        // Criação da Matriz
        Posicao[][] matriz = new Posicao[qtdLinhas][qtdColunas];

        // Controla se algum lugar da matriz ja foi visitado anteriormente
        boolean[][] visitado = new boolean[qtdLinhas][qtdColunas];

        // Pegar a posição inicial
        posicaoInicalLinha = reader.nextInt();
        posicaoInicalColuna = reader.nextInt();

        // Teste
        System.out.println("Quantidade de linhas: " + qtdLinhas + "\nQuantidade de colunas: " + qtdColunas
                + "\nPosição inicial linha: " + posicaoInicalLinha + "\nPosição inicial coluna: "
                + posicaoInicalColuna);

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                // Lê os valores em cada posição
                matriz[linha][coluna] = new Posicao();
                matriz[linha][coluna].linha = reader.nextInt();
                matriz[linha][coluna].coluna = reader.nextInt();

            }
        }

        System.out.println("\n=====================\n\nMatriz:\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j].linha + ", " + matriz[i][j].coluna + "    ");
            }
            System.out.println("");
        }

        System.out.println("\n=====================\n\nCaminho percorrido:\n");
        int contador = 1;

        while (true) {
            // imprime a coordenada atual
            System.out.println("Passo " + contador + ": " + posicaoInicalLinha + "," + posicaoInicalColuna);

            // Se já foi visitado → achou o tesouro
            if (visitado[posicaoInicalLinha][posicaoInicalColuna]) {

                System.out.println("O tesouro está nas coordenadas " + matriz[posicaoInicalLinha][posicaoInicalColuna].linha + "," + matriz[posicaoInicalLinha][posicaoInicalColuna].coluna + ".");
                break;
            }

            // Marca como visitado
            visitado[posicaoInicalLinha][posicaoInicalColuna] = true;

            // Pega o próximo destino
            int proxLinha = matriz[posicaoInicalLinha][posicaoInicalColuna].linha;
            int proxColuna = matriz[posicaoInicalLinha][posicaoInicalColuna].coluna;

            // Atualiza posição
            posicaoInicalLinha = proxLinha;
            posicaoInicalColuna = proxColuna;

            contador++;
        }

        // FECHAMENTO DO ARQUIVO
        try {
            file_reader.close();
            reader.close();

        } catch (IOException e) {
            IO.imprimirErro("Erro ao abrir o arquivo");
            e.printStackTrace();
        }
    }
}