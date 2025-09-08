package avaliacoes.trabalhos.T3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class ImagemPPM extends Imagem {
        int[][][] pixels;

        ImagemPPM(int linhas, int colunas, Scanner sc) {
            this.linhas = linhas;
            this.colunas = colunas;
            pixels = new int[linhas][colunas][3];
            for (int i = 0; i < linhas; i++)
                for (int j = 0; j < colunas; j++)
                    for (int k = 0; k < 3; k++)
                        pixels[i][j][k] = sc.nextInt();
        }

        public void rotacaoHorario() {
            int[][][] nova = new int[colunas][linhas][3];
            for (int i = 0; i < linhas; i++)
                for (int j = 0; j < colunas; j++)
                    for (int k = 0; k < 3; k++)
                        nova[j][linhas - 1 - i][k] = pixels[i][j][k];
            pixels = nova;
            int temp = linhas;
            linhas = colunas;
            colunas = temp;
        }

        public void espelhamentoHorizontal() {
            for (int i = 0; i < linhas; i++)
                for (int j = 0; j < colunas / 2; j++)
                    for (int k = 0; k < 3; k++) {
                        int temp = pixels[i][j][k];
                        pixels[i][j][k] = pixels[i][colunas - 1 - j][k];
                        pixels[i][colunas - 1 - j][k] = temp;
                    }
        }

        public void espelhamentoVertical() {
            for (int i = 0; i < linhas / 2; i++)
                for (int j = 0; j < colunas; j++)
                    for (int k = 0; k < 3; k++) {
                        int temp = pixels[i][j][k];
                        pixels[i][j][k] = pixels[linhas - 1 - i][j][k];
                        pixels[linhas - 1 - i][j][k] = temp;
                    }
        }

        public void salvar(File arquivo) throws IOException {
            PrintWriter pw = new PrintWriter(arquivo);
            pw.println("P3");
            pw.println(colunas + " " + linhas);
            pw.println(255);
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++)
                    pw.println(pixels[i][j][0] + " " + pixels[i][j][1] + " " + pixels[i][j][2]);
            }
            pw.close();
        }
    }
