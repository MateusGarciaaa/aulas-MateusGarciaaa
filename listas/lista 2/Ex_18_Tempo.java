import java.util.Scanner;

public class Ex_18_Tempo {

    // metodo scanner
    public static Scanner tecladoScanner = new Scanner(System.in);

    // metodo que imprime
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    // metodo que recebe um valor inteiro
    public static double lerValorDouble() {
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static void main(String[] args) {
        int tempo = 0;
        double massa = 0;

        imprimir("Digite uma massa inicial em Kg");
        massa = lerValorDouble();

        while (massa > 0.05) {
            massa = massa / 2;
            tempo = tempo + 1;
        }

        imprimir("vai demorar " + tempo + " minutos ate que a massa se reduza a menos de 0.05Kg (" + massa + " Kg)");

    }

}
