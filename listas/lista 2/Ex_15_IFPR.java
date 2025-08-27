/*

15. Foi realizada uma pesquisa sobre algumas características físicas dos alunos do IFPR, a qual
coletou os seguintes dados referentes a cada estudante para análise:
• Idade.
• Ensino (’T’ Técnico ou ’S’ - Superior);
Faça um algoritmo que determine e escreva:
• A quantidade de indivíduos do ensino técnico e superior;
• O total de indivíduos com idade entre 18 e 35 anos;
O final do conjunto de estudantes é reconhecido pelo valor 0 entrando como idade.

 */

import java.util.Scanner;

public class Ex_15_IFPR {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static int lerValorInteiro() {
        int valor = tecladoScanner.nextInt();
        return valor;
    }

    public static String lerValorString() {
        String letra = tecladoScanner.next();
        return letra;
    }

    public static void processar() {
        String ensino = "";
        int idade = 0;
        int qtdTec = 0;
        int qtdSup = 0;
        int intervaloIDade = 0;

        while (true) {
            imprimir("Digite a sua idade (ou digite 0 para encerrar o programa)");
            idade = lerValorInteiro();

            if (idade == 0) {
                break;
            }

            imprimir("Digite 'T' para curso tecnico e 'S' para superior ");
            ensino = lerValorString();

            if (idade >= 18 && idade <= 35) {
                intervaloIDade++;
            }

            if (ensino.equals("T")) {
                qtdTec++;
            } else if (ensino.equals("S")) {
                qtdSup++;
            }

        }
        imprimir("Encerrando coleta de dados");
        imprimir("");
        imprimir("A quantidade de alunos com idade entre 18 e 35 anos é: " + intervaloIDade);
        imprimir("A quantidade de alunos no ensino tecnico é: " + qtdTec);
        imprimir("A quantidade de alunos no ensino superior é: " + qtdSup);

    }

    public static void main(String[] args) {
        processar();
    }
}
