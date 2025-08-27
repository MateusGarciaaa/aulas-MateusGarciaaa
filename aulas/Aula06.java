package aulas;

import utils.IO;

public class Aula06 {

    public static void aula() {
        // Exercicio 1
        // crescenteEDecrescente();

        // Exercicio 2
        somaImpares();

        // Exercicio 3

    }

    public static void crescenteEDecrescente() {
        // variáveis
        int valorUm, valorDois;
        String saida = null;

        while (true) {
            IO.imprimir("Digite os valores");
            valorUm = IO.lerValorInteiro();
            valorDois = IO.lerValorInteiro();

            if (valorUm > valorDois) {
                saida = "decrescente";
            } else if (valorDois > valorUm) {
                saida = "crescente";
            } else {
                break;
            }
            IO.imprimir(saida);
        }
    }

    public static void somaImpares() {
        int fim, inicio, somaImpares = 0, x, y;

        IO.imprimir("Digite dois valores inteiros");
        x = IO.lerValorInteiro();
        y = IO.lerValorInteiro();

        if (x >= y) {
            inicio = y;
            fim = x;
        } else {
            inicio = x;
            fim = y;
        }
        for (int contador = inicio + 1; contador < fim; contador++) {
            if (contador % 2 != 0) {
                somaImpares += contador;
            }
        }
        IO.imprimirValorInteiro(somaImpares);

    }

}