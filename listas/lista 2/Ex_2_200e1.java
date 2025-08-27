public class Ex_2_200e1 {

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static void main(String[] args) {
        int inicio = 200;
        int fim = 1;
        int cont = inicio;
        String saida = "";

        while (cont >= fim) {
            saida = "" + cont;
            imprimir(saida);
            cont = cont - 1;
        }
    }

}