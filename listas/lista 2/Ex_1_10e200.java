
public class Ex_1_10e200 {
    

    public static void imprimir (String texto){
        System.out.println(texto);
    }


    public static void main(String[] args) {
        int inicio = 10;
        int fim = 200;
        int cont = inicio;
        String saida;


        while (  cont <= fim  ){
            saida = "" + cont;
            imprimir (saida);
            cont = cont+1;
        }
    }
}