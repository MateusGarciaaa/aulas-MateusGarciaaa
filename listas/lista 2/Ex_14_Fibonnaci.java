import java.util.Scanner;

public class Ex_14_Fibonnaci {

        public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static long lerValorlong() {
        long valor;
        valor = tecladoScanner.nextLong();
        return valor;
    }

    public static void processo(){
        int penNum = 0;
        int ultNum = 1;
        int num = 0;

        for(  int i = 2; i <= 10; i++  ){
            num = ultNum + penNum;
            imprimir("o termo de número " + i + " é igual a: " + num);
            penNum = ultNum;
            ultNum = num;
        }
        
    }

    public static void main(String[] args) {
        imprimir("O termo de numero 1 é igual a: 1");
        processo();
    }

}
