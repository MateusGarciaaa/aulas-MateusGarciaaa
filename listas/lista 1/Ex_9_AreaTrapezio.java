import java.util.Scanner;

public class Ex_9_AreaTrapezio {


    public static Scanner tecladoScanner = new Scanner (System.in);
    


    //metodo que recebe um texto e imprime na tela
    public static void imprimir(String texto) {
           System.out.println(texto);
   }


    //metodo que recebe um valor que o usuario digitar
        public static double lerValorDoubleAltura(){
            double valor;
        valor = tecladoScanner.nextDouble();
        return valor;}
        
   
        public static double lerValorDoubleBaseMaior(){
            double valor;
            valor = tecladoScanner.nextDouble();
            return valor;
            }


        public static double lerValorDoubleBaseMenor(){
             double valor;
                valor = tecladoScanner.nextDouble();
                return valor;
        }


        public static double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
            double resultado = ((baseMaior + baseMenor) * altura) / 2;
            return resultado;
        }
        




        /*9. Algoritmo trapézio – Elabore um algoritmo em fluxograma para calcular a área de um
        trapézio. Sabe-se que:

        areatrapezio =

        ((baseMaior + baseMenor) ∗ altura) / 2
        Lembre-se a altura, a base maior e a base menor devem ser números maiores que zero. Se o
        usuário digitar algo inválido informar do erro. */






    public static void main(String[] args) {
        double baseMaior;
        double baseMenor;
        double altura;
        double areatrapezio;
        String saida;




        //entrada
            imprimir("Qual é o valor da base maior do trapézio?");
            baseMaior = lerValorDoubleBaseMaior();
            imprimir("Qual é o valor da base menor do trapézio?");
            baseMenor = lerValorDoubleBaseMenor();
            imprimir("Qual é o valor da altura do trapézio?");
            altura = lerValorDoubleAltura();



        //Processamento
            areatrapezio = calcularAreaTrapezio (altura, baseMaior, baseMenor);


        //Saída
        saida = ("A área do trapézio é igual a: " + areatrapezio);
        imprimir(saida);


    }
}