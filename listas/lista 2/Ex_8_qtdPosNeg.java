/*

8. Escreva um algoritmo que leia a quantidade de números positivos a serem lidos (N),
posteriormente leia os N números inteiros fornecidos e ao final exiba:
a) a quantidade de números positivos;
b) a quantidade de números negativos.

*/

import java.util.Scanner;

public class Ex_8_qtdPosNeg {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static void contarPositivosNegativos(int qtdNum) {
        int qtdPos = 0;
        int qtdNeg = 0;
        for (int i = 1; i <= qtdNum; i++) {
            // receber o valor digitado
            imprimir("Digite o " + i + "º valor");
            int num = lerValorInteiro();

            if (num >= 0) {
                qtdPos++;
            } else {
                qtdNeg++;
            }

        }

        imprimir("A quantidade de numeros positivos é igual a: " + qtdPos);
        imprimir("A quantidade de numeros negativos é igual a: " + qtdNeg);

    }

    public static void main(String[] args) {
        // Definir variaveis
        int qtdNum = 0;

        // atribuicao de valores

        imprimir("Quantos numeros voce vai digitar?");
        qtdNum = lerValorInteiro();

        contarPositivosNegativos(qtdNum);

    }

}
