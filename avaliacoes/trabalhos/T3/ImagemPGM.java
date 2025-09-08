package avaliacoes.trabalhos.T3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class ImagemPGM extends Imagem {
    int[][] pixels;

    ImagemPGM(int linhas, int colunas, Scanner sc) {
        this.linhas = linhas;
        this.colunas = colunas;
        pixels = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++)
            for (int j = 0; j < colunas; j++)
                pixels[i][j] = sc.nextInt();
    }

    public void rotacaoHorario() {
        int[][] nova = new int[colunas][linhas];
        for (int i = 0; i < linhas; i++)
            for (int j = 0; j < colunas; j++)
                nova[j][linhas - 1 - i] = pixels[i][j];
        pixels = nova;
        int temp = linhas;
        linhas = colunas;
        colunas = temp;
    }

    public void espelhamentoHorizontal() {
        for (int i = 0; i < linhas; i++)
            for (int j = 0; j < colunas / 2; j++) {
                int temp = pixels[i][j];
                pixels[i][j] = pixels[i][colunas - 1 - j];
                pixels[i][colunas - 1 - j] = temp;
            }
    }

    public void espelhamentoVertical() {
        for (int i = 0; i < linhas / 2; i++)
            for (int j = 0; j < colunas; j++) {
                int temp = pixels[i][j];
                pixels[i][j] = pixels[linhas - 1 - i][j];
                pixels[linhas - 1 - i][j] = temp;
            }
    }

    public void salvar(File arquivo) throws IOException {
        PrintWriter pw = new PrintWriter(arquivo);
        pw.println("P2");
        pw.println(colunas + " " + linhas);
        pw.println(255);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++)
                pw.print(pixels[i][j] + " ");
            pw.println();
        }
        pw.close();
    }
}
