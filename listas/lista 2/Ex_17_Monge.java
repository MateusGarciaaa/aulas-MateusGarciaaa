import java.util.Scanner;

public class Ex_17_Monge {
    
    public static void imprimir(String texto){
        System.out.println(texto);
    }

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static long processo( long atual){


        for(int i = 1; i <= 64; i = i+1){
           
            imprimir("Casa " + i + ": " + atual);
            atual = atual * 2;
        }
        return atual ;
    }



    public static void main(String[] args) {
        long atual = 1;


        processo(atual);
    }
}
