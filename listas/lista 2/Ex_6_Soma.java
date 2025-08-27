import java.util.Scanner;

public class Ex_6_Soma {
    
    public static void imprimir(String texto){
        System.out.println(texto);
    }

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static int lerValorInteiro(){
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static int processar(int inicio, int fim){
        int soma = 0;

        for (int i = inicio; i <= fim; i = i + 1){
            soma = soma + i;
            imprimir("" + soma);
        }

        return soma;  
    }

    public static void main(String[] args) {
        int inicio;
        int fim;
        int soma;

        imprimir("Digite um valor de inicio");
        inicio = lerValorInteiro();
        imprimir("Digite um valor de fim");
        fim = lerValorInteiro();

        soma = processar(inicio, fim);

        imprimir("A soma final é: " + soma);
    }
}
