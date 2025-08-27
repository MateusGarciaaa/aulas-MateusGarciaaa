import java.util.Scanner;

public class Ex_12_Natacao {

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
        // DEFINICAO DE VARIAVEIS
        int idade = 0;
        String categoria = null;
        String saida = null;

        imprimir("digite a sua idade");
        idade = tecladoScanner.nextInt();

        if (idade >= 3) {
            if (idade <= 5) {
                categoria = "Infantil A";
            } else if (idade <= 9) {
                categoria = "Infantil B";
            } else if (idade <= 13) {
                categoria = "Juvenil A";
            } else if (idade <= 17) {
                categoria = "Juvenil B";
            } else {
                categoria = "Senior";
            }

            saida = "A sua idade é igual a: " + idade + ", portanto a sua cateforia é: " + categoria;

        } else {
            saida = "a idade minima é 3 anos";
        }

        imprimir(saida);

    }

}