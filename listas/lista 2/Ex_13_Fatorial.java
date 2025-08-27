import java.util.Scanner;

public class Ex_13_Fatorial {
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static long lerValorlong() {
        long valor;
        valor = tecladoScanner.nextLong();
        return valor;
    }

    public static void processo() {
        imprimir("Qual e o numero?");
        long num = lerValorlong();
        long resultado = 1;

        for (; num > 0; num = num - 1) {
            resultado = resultado * num;
        }

        imprimir("O resultado e: " + resultado);
    }

    public static void main(String[] args) {

        processo();
    }

}
