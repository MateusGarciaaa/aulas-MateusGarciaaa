import java.util.Scanner;

public class Ex_3_0eValor {

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int valor;
        int inicio = 0;
        int cont = inicio;
        String saida;

        imprimir("Digite um valor positivo");
        valor = lerValorInteiro();
        if (valor < 0) {
            saida = "erro, o valor digitado e menor ou igual a 0";
            imprimir(saida);
        } else {

            while (cont <= valor) {
                saida = "" + cont;
                imprimir(saida);
                cont = cont + 1;

            }

        }
    }

}