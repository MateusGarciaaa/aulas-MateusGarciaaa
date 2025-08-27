import java.util.Scanner;

public class Ex_1_AlturaPredio {

    public static Scanner tecladoScanner = new Scanner(System.in);

    // metodo que recebe um texto e imprime na tela
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double lerValorReal() {
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;

    }

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static double calcularAlturaPredio(double alturaAndar, int quantidadeAndar) {
        double resultado;
        resultado = alturaAndar * quantidadeAndar;
        return resultado;

    }

    /*
     * 1. Algoritmo prédio – Elaborar um algoritmo em fluxograma que
     * leia a altura dos andares de um prédio e o número de andares,
     * calcule e imprima a altura do prédio.
     */
    public static void main(String[] args) {

        double alturaAndar;
        int quantidadeAndar;

        double AlturaPredio;
        String saida;

        // entrada
        imprimir("Qual é a altura de cada andar? ");
        alturaAndar = lerValorReal();
        imprimir("Qual é a quantidade de andares? ");
        quantidadeAndar = lerValorInteiro();

        // Processamento
        AlturaPredio = calcularAlturaPredio(alturaAndar, quantidadeAndar);

        // saída
        saida = "A altura do prédio é: " + AlturaPredio;
        imprimir(saida);
    }
}
