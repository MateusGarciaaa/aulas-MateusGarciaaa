/*Algoritmo consumo – Elaborar um algoritmo em fluxograma que calcule o consumo médio
de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível
gasto (em litros).
Entrada: A entrada contém dois valores: um valor inteiro dist representando a distância total
percorrida (em Km), e um valor real gasto representando o total de combustível gasto.
Saída: Apresente o valor que representa o consumo médio do automóvel seguido da mensagem
"km/l".*/

import java.util.Scanner;

public class Ex_4_Consumo {

    public static Scanner tecladoScanner = new Scanner(System.in);

    // Metodo que imprime texto na tela
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double lerValorDouble() {
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static double ResultadoConsumo(double distancia, double combustivel) {
        double resultado;
        resultado = distancia / combustivel;
        return resultado;
    }

    public static void main(String[] args) {
        // VARIAVEIS
        double combustivel;
        double distancia;
        double resultado;
        String saida;

        imprimir("Qual foi a distancia percorrida?");
        distancia = tecladoScanner.nextDouble();
        imprimir("Qual foi a quantidade de combustível gasto?");
        combustivel = tecladoScanner.nextDouble();

        resultado = ResultadoConsumo(distancia, combustivel);

        saida = "Sua média de combustivel gasto foi de " + resultado + " km/L";

        imprimir(saida);

    }

}