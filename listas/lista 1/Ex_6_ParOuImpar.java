import java.util.Scanner;

public class Ex_6_ParOuImpar {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static int lerValorInteiro() {
        int valor = tecladoScanner.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int num;
        String result;

        imprimir("Qual é a altura de cada andar?");
        num = lerValorInteiro();

        if (num % 2 == 0) {
            result = "par";
        } else {
            result = "ímpar";
        }
        imprimir("O seu numero e: " + result);
    }
}
