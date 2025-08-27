/*

8. Escreva um algoritmo que leia a quantidade de números positivos a serem lidos (N),
posteriormente leia os N números inteiros fornecidos e ao final exiba:
a) a quantidade de números positivos;
b) a quantidade de números negativos.

*/

import java.util.Scanner;

public class Ex_9_qtdParImp {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static void contarParImpar(int qtdNum) {
        int qtdPar = 0;
        int qtdImp = 0;
        for (int i = 1; i <= qtdNum; i++) {
            // receber o valor digitado
            imprimir("Digite o " + i + "º valor");
            int num = lerValorInteiro();

            if (num %2 == 0) {
                qtdPar++;
            } else {
                qtdImp++;
            }

        }

        imprimir("A quantidade de numeros pares é igual a: " + qtdPar);
        imprimir("A quantidade de numeros impares é igual a: " + qtdImp);

    }

    public static void main(String[] args) {
        // Definir variaveis
        int qtdNum = 0;

        // atribuicao de valores

        imprimir("Quantos numeros voce vai digitar?");
        qtdNum = lerValorInteiro();

        contarParImpar(qtdNum);

    }

}
