import java.util.Scanner;

public class Ex_7_SomaPares {

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static int processar(int inicio, int fim) {
        int soma = 0;
        for (int i = inicio; i <= fim; i = i + 1) {
            if (i % 2 == 0) {
                soma = soma + i;
            }

        }
        return soma;
    }

    public static void main(String[] args) {
        int inicio;
        int fim;
        int somaFinal;

        imprimir("Digite um valor de início");
        inicio = lerValorInteiro();
        imprimir("Digite um valor de início");
        fim = lerValorInteiro();

        somaFinal = processar(inicio, fim);
        imprimir("Soma dos pares: " + somaFinal);

    }

}