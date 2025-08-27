package aulas;

import utils.IO;

public class Aula04 {

    public static void aula() {
        System.out.println("Aula 04");
        // exercicio 01
        ex01();
    }

    // EXERCICIO TESTE
    // usuario informa dois valores e deve retornar o maior valor digitado
    public static void ex01() {
        // variaveis
        int valorUm;
        int valorDois;
        int maiorValor;

        // entrada
        IO.imprimir("Digite o primeiro valor");
        valorUm = IO.lerValorInteiro();
        IO.imprimir("Digite o segundo valor");
        valorDois = IO.lerValorInteiro();

        // processamento
        maiorValor = processarMaiorValor(valorUm, valorDois);
        // saida
        IO.imprimir("O maior valor digitado é: " + maiorValor);
    }
    public static int processarMaiorValor(int valorUm, int valorDois){
        int maiorValor;
        if (valorUm >= valorDois) {
            maiorValor = valorUm;
        } else {
            maiorValor = valorDois;
        }
        return maiorValor;
    }
}