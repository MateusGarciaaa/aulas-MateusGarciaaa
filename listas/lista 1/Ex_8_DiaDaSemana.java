import java.util.Scanner;

public class Ex_8_DiaDaSemana {

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
        int numero = 0;
        String diaSemana = null;
        String saida;

        imprimir("digite um numero menor ou igual a 7 e maior que 0 e direi qual dia da semana corresponde a ele");
        numero = tecladoScanner.nextInt();

        if (numero <= 7 && numero > 0) {
            if (numero == 1) {
                diaSemana = "Domingo";
            } else if (numero == 2) {
                diaSemana = "Segunda-Feira";
            } else if (numero == 3) {
                diaSemana = "Terça-Feira";
            } else if (numero == 4) {
                diaSemana = "Quarta-Feira";
            } else if (numero == 5) {
                diaSemana = "Quinta-Feira";
            } else if (numero == 6) {
                diaSemana = "Sexta-Feira";
            } else if (numero == 7) {
                diaSemana = "Sábado";
            }
            saida = "o dia da semana correspondente ao número digitado é: " + diaSemana;
        } else {
            saida = "número inválido";
        }

        imprimir(saida);

    }

}
