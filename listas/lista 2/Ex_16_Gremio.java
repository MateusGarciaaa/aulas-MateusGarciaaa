import java.util.Scanner;


public class Ex_16_Gremio {


   public static Scanner tecladoScanner = new Scanner(System.in);


   public static void imprimir(String texto) {
       System.out.println(texto);
   }


   public static int lerValorInteiro() {
       int valor = tecladoScanner.nextInt();
       return valor;
   }


   public static void processar() {
       int qtdVotoDois = 0;
       int qtdVotoUm = 0;
       int votosVencedor;
       String vencedor;


       for (int i = 0; i < 305; i++) {
           imprimir("Digite o seu voto");
           int voto = lerValorInteiro();
           if (voto == 1) {
               qtdVotoUm = qtdVotoUm + 1;
           } else if (voto == 2) {
               qtdVotoDois = qtdVotoDois + 1;
           } else {
               imprimir("Número inválido");
               i = i - 1;
           }


       }
       if (qtdVotoUm > qtdVotoDois) {
           vencedor = "candidato um";
           votosVencedor = qtdVotoUm;
       } else {
           vencedor = "Candidato dois";
           votosVencedor = qtdVotoDois;
       }
       imprimir("O vencedor das eleições é o " + vencedor + ", e ele obteve " + votosVencedor + " votos");
   }


   public static void main(String[] args) {
       processar();
   }


}



