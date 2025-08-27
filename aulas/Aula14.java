package aulas;
import utils.IO;

public class Aula14 {


    public static void aula(){

        
       IO.imprimir(cifraDeCesar(IO.lerValorString("Digite uma palavra: "), IO.lerValorInteiro("Digite um valor de deslocamento: "))); ;
    }

    public static void main(String[] args) {
        // String senha = "4a5r9j03";
        // String texto;

        // texto=IO.lerPalavra("Digite a senha");

        // if (senha.equals(texto)) {
        // IO.imprimir("ACESSO PERMITIDO");
        // }else{
        // IO.imprimir("ACESSO NEGADO");
        // }

        // IO.imprimir("palindromo: " + IO.palindromo("arara"));

        int[][] matriz = {
            { 1, 2, 3, 4, 5 },
            { 6, 7, 8, 9, 10 },
            { 11, 12, 13, 14, 15 },
            { 16, 17, 18, 19, 20 }
        };

        IO.imprimirMatriz(permutacaoMatriz(matriz));
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

    public static String cifraDeCesar(String texto, int deslocamento){
        String resultado = "";

        for(int indice = 0; indice < texto.length(); indice++){
            char letra = texto.charAt(indice);

            if (letra >= 'A' && letra <= 'Z') {
                int valorLetra = letra - 'A';
                valorLetra = (valorLetra + deslocamento) % 26;
                resultado = resultado + (char)('A' + valorLetra);
            }

            if (letra >= 'a' && letra <= 'z') {
                int valorLetra = letra - 'a';
                valorLetra = (valorLetra + deslocamento) % 26;
                resultado = resultado + (char)('a' + valorLetra);
            }
        }

        return resultado;
    }
    
}