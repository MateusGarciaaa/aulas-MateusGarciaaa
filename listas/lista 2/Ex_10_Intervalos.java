/*
10. Elaborar um algoritmo que leia a quantidade de números positivos a serem lidos (N),
posteriormente leia os N números inteiros fornecidos e compute a quantidade para cada intervalo
abaixo e escreva:
a) Quantos deles estão no intervalo [0..25]
b) Quantos estão no intervalo [26..50]
c) Quantos são maiores do que 50.
*/

import java.util.Scanner;

public class Ex_10_Intervalos {

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
        int primeiroIntervalo = 0;
        int segundoIntervalo = 0;
        int terceiroIntervalo = 0;
        for (int i = 1; i <= qtdNum; i++) {
            // receber o valor digitado
            imprimir("Digite o " + i + "º valor");
            int num = lerValorInteiro();

            if (num <=25 ) {
                primeiroIntervalo++;
            } else if (num <=50) {
                segundoIntervalo++;
            }else{
                terceiroIntervalo++;
            }

        }

        imprimir("A quantidade de numeros entre 0 e 25 é igual a: " + primeiroIntervalo);
        imprimir("A quantidade de numeros entre 25 e 50 é igual a: " + segundoIntervalo);
        imprimir("A quantidade de numeros maior que 50 é igual a: " + terceiroIntervalo);

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

