import java.util.Scanner;

public class Ex_2_CotacaoDolar {

    
    public static Scanner tecladoScanner = new Scanner(System.in);


    //Metodo que imprime texto na tela
    public static void imprimir (String texto){
        System.out.println(texto);
    }

    public static double lerValorDouble(){
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static double calcularValorReal(double qtdDol, double cotacaoDol){
        double resultado;
        resultado = cotacaoDol * qtdDol;
        return resultado;
    }




    public static void main (String[] args){

        // Definição de variáveis
            double cotacaoDol;
            double qtdDol;
            double qtdReais;
            String saida;


        //ENTRADA
            imprimir("Qual é a cotação do dólar atualmente?");
            cotacaoDol = lerValorDouble();
            imprimir("Qual é a quantidade de dólares que você tem?");
            qtdDol = lerValorDouble();      


        // PROCESSO
            qtdReais = calcularValorReal(qtdDol, cotacaoDol);


        // OUT
            saida = "A quantidade de dólares em reais é: " + qtdReais;
            imprimir(saida);
    }





























}