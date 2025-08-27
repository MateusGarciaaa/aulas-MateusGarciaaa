import java.util.Scanner;

public class Ex_11_Mult7 {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;

    }

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static void processar(int num, int qtdNum) {
        for (int i = 0; i < qtdNum; i = i + 1) {
            imprimir("digite o " + (i + 1) + "° numero");
            num = lerValorInteiro();

            // verifica se o valor esta dentro do intervalo
            if (num < 1 || num > 1000) {
                imprimir("o numero digitado esta fora do intervalo permitido (1-1000)");
               
            }

            if (num % 7 == 0) {
                imprimir("o numero " + num + " é múltiplo de 7");
            } else {
                imprimir("o numero " + num + " não é multiplo de 7");
            }
        }
    }

    public static void main(String[] args) {
        int num = 0;
        
        imprimir("Quantos valores voce vai digitar?");
        int qtdNum = lerValorInteiro();

        processar(num, qtdNum);
    }

}
