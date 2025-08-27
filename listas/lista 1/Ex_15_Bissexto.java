import java.util.Scanner;

public class Ex_15_Bissexto {
    

    // METODO QUE IMPRIME
    public static void imprimir(String texto){
        System.out.println(texto);
    }

    //METODO QUE RECEBE UM VALOR DIGITADO
    public static Scanner tecladoScanner = new Scanner (System.in);

    //METODO QUE RECEBE UM VALOR INT
    public static int lerValorInt(){
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int ano = 0;
        String bissexto = null;
        String saida;

        imprimir("Digite um ano e direi se ele é bissexto ou não");
        ano = tecladoScanner.nextInt();


        if (  ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0  ) {
            bissexto = "é";
        }else{
            bissexto = "não é";
        }

        saida = "O ano digitado " + bissexto + " bissexto";

        imprimir(saida);


    }



}
