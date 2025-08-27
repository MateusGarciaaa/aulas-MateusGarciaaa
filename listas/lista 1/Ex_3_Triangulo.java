/*3. Faça um algoritmo onde o usuário digita um valor, e imprima todos os valores entre 0 e o valor
digitado. */

import java.util.Scanner;

public class Ex_3_Triangulo {

    // METODO QUE IMPRIME NA TELA
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    // METODO QUE RECEBE UM VALOR DOUBLE
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // DEFINIÇÃO DE VARIÁVEIS
        double ladoUm;
        double ladoDois;
        double ladoTres;
        String resultado;
        String saida;

        // DEFINIR OS VALORES DAS VARIAVEIS

        imprimir("Qual e o valor do primeiro lado do triangulo?");
        ladoUm = tecladoScanner.nextDouble();
        imprimir("Qual e o valor do segundo lado do triangulo?");
        ladoDois = tecladoScanner.nextDouble();
        imprimir("Qual e o valor do terceiro lado do triangulo?");
        ladoTres = tecladoScanner.nextDouble();

        // PROCEDIMENTO

        if (ladoUm == ladoDois ) {
            if (ladoDois == ladoTres) {
                resultado = "equilátero";
            } else {
                resultado = "isóceles";
            }
        } else {
            if (ladoDois == ladoTres) {
                resultado = "isóceles";
            } else {
                resultado = "escaleno";
            }
        }

        // SAIDA

        saida = "o seu triângulo é " + resultado;
        imprimir(saida);
    }
}