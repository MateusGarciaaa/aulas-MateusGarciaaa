package utils;

import utils.IO;

public class VETORES {

    public static void imprimirVetor(int[] vetor) {

        String saida = "[";

        for (int i = 0; i < vetor.length; i++) {
            if (i == 0) {
                saida = saida + vetor[i];
            }
            if (i > 0) {
                saida = saida + ", " + vetor[i];
            }
        }

        saida = saida + "]";

        IO.imprimir(saida);
    }

    public static void imprimirVetorDouble(double[] vetor) {

        String saida = "[";

        for (int i = 0; i < vetor.length; i++) {
            if (i == 0) {
                saida = saida + vetor[i];
            }
            if (i > 0) {
                saida = saida + ", " + vetor[i];
            }
        }

        saida = saida + "]";

        IO.imprimir(saida);
    }

    public static void imprimirVetorString(String[] vetor) {

        String saida = "[";

        for (int i = 0; i < vetor.length; i++) {
            if (i == 0) {
                saida = saida + vetor[i];
            }
            if (i > 0) {
                saida = saida + ", " + vetor[i];
            }
        }

        saida = saida + "]";

        IO.imprimir(saida);
    }

    public static void imprimirVetorBool(boolean[] vetor) {

        String saida = "[";

        for (int i = 0; i < vetor.length; i++) {
            if (i == 0) {
                saida = saida + vetor[i];
            }
            if (i > 0) {
                saida = saida + ", " + vetor[i];
            }
        }

        saida = saida + "]";

        IO.imprimir(saida);
    }

    // Remove os numeros repetidos dentro de um vetor
    public static int[] removerRepetidos(int[] vetor) {

        int contador = contarQtdNaoRepetidos(vetor);

        int vetor_retorno[] = new int[contador];
        int posicaoSalvar = 0;


        for (int indiceUm = 0; indiceUm < vetor.length; indiceUm++) {
            boolean conferir = false;

            for (int indiceDois = 0; indiceDois <= indiceUm; indiceDois++) {

                if (vetor[indiceUm] == vetor[indiceDois]) {
                    conferir = true;
                }
            }
            if (!conferir) {
                vetor_retorno[posicaoSalvar] = vetor[indiceUm];
                posicaoSalvar++;    
            }
        }

        return vetor_retorno;
    }


    //Conta quantos numeros nao repetidos há dentro de um vetor
    public static int contarQtdNaoRepetidos(int vetor[]) {

        int contador = vetor.length;

        for (int indiceUm = 0; indiceUm < vetor.length; indiceUm++) {

            for (int indiceDois = 0; indiceDois <= indiceUm; indiceDois++) {

                if (vetor[indiceUm] == vetor[indiceDois]) {
                    contador--;
                }
            }

        }

        return contador;
    }


    public static double calcularMediaVetor(int[]vetor){
        double media = 0;
        int somaNumero = 0;
        int qtdNumeros = 0;

        for(int i = 0; i < vetor.length; i++){
            somaNumero = somaNumero + vetor[i];
            qtdNumeros++;
        }

        media = (double) somaNumero/qtdNumeros;
        return media;

    }

}
