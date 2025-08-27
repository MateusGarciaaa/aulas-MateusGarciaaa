import java.util.Scanner;

public class Ex_7_MaiorMenor {

    public static Scanner tecladoScanner = new Scanner(System.in);

    // metodo que recebe um texto e imprime na tela
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        // definição de variavel

        int valorUm;
        int valorDois;
        int valorTres;
        String saida;
        int resultado = 0;

        imprimir("digite o primeiro valor");
        valorUm = tecladoScanner.nextInt();
        imprimir("digite o segundo valor");
        valorDois = tecladoScanner.nextInt();
        imprimir("digite o terceiro valor");
        valorTres = tecladoScanner.nextInt();

        if (valorUm > valorDois) {
            if (valorUm > valorTres) {
                resultado = valorUm;
            } else if (valorDois < valorTres) {
                resultado = valorTres;
            }
        } else if (valorDois > valorTres) {
            resultado = valorDois;

        } else {
            resultado = valorTres;
        }

        saida = "o maior numero digitado foi: " + resultado;
        imprimir(saida);

    }

}
