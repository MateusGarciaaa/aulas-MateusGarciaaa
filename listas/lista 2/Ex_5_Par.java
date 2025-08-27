import java.util.Scanner;

public class Ex_5_Par {

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;

    }

    public static void processar(int inicio, int fim) {
        int i;

        for (i = inicio; i <= fim; i = i + 1) {
            if (i % 2 == 0) {
                imprimir("" + i);

            }
        }

    }

    public static void main(String[] args) {
        int inicio;
        int fim;

        imprimir("Digite um valor de inicio");
        inicio = lerValorInteiro();
        imprimir("Digite um valor de fim");
        fim = lerValorInteiro();

        imprimir("Os números pares dentro do intevalo são:");

        processar(inicio, fim);

    }

}
