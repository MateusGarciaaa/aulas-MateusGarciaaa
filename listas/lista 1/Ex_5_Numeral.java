import java.util.Scanner;

public class Ex_5_Numeral {

    // SCANNER
    public static Scanner tecladoScanner = new Scanner(System.in);

    // METODO QUE ESCANEIA UM VALOR INTEIRO DIGITADO PELO USUARIO
    public static int lerValorInt() {
         int valor;
         valor = tecladoScanner.nextInt();
         return valor;
    }

    // METODO QUE IMPRIME UM VALOR NA TELA
    public static void imprimir(String texto) {
         System.out.println(texto);
    }

    public static void main(String[] args) {

        // DEFINICAO DE VARIAVEIS
        int numero = 0;
        String resultado;
        String saida;

        imprimir("digite um numero e direi se ele e positivo, negativo ou zero");
        numero = tecladoScanner.nextInt();

        if (numero != 0) {
            if (numero > 0) {
                resultado = "positivo";
            } else {
                resultado = "negativo";
            }
        } else {
            resultado = "zero";
        }

        saida = "o seu número é " + resultado;

        imprimir(saida);

    }

}
