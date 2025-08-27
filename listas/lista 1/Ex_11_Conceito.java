import java.util.Scanner;

public class Ex_11_Conceito {

    public static Scanner tecladoScanner = new Scanner(System.in);

    // Metodo que imprime texto na tela
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double lerValorDouble() {
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static String lerValroString() {
        String nome;
        nome = tecladoScanner.nextLine();
        return nome;
    }

    public static double calcularValorMedia(double notaUm, double notaDois, double notaTres) {
        double resultado;
        resultado = (notaUm * 2 + notaDois * 3 + notaTres * 5) / 10;
        return resultado;
    }

    public static void main(String[] args) {
        // definição de variaveis
        double notaUm = 0;
        double notaDois = 0;
        double notaTres = 0;
        double mediaNota = 0;
        String saida = null;
        char conceito = ' ';
        String nome = null;
        String aprovacao = null;

        imprimir("Qual é o seu nome?");
        nome = tecladoScanner.nextLine();
        imprimir("Qual foi sua primeira nota?");
        notaUm = tecladoScanner.nextDouble();
        imprimir("Qual foi sua segunda nota?");
        notaDois = tecladoScanner.nextDouble();
        imprimir("Qual foi sua terceira nota?");
        notaTres = tecladoScanner.nextDouble();

        mediaNota = calcularValorMedia(notaUm, notaDois, notaTres);

        if (mediaNota >= 9) {
             conceito = 'A';
        } else if (mediaNota >= 7.5) {
             conceito = 'B';
        } else if (mediaNota >= 6) {
             conceito = 'C';
        } else if (mediaNota >= 4) {
             conceito = 'D';
        } else {
             conceito = 'E';
        }

        if (mediaNota >= 6) {
            aprovacao = "aprovado";
        } else {
            aprovacao = "reprovado";
        }

        saida = "O aluno " + nome + " obteve media igual a: " + mediaNota + "e obteve o conceito: " + conceito
                + ". Portanto, foi " + aprovacao;

        imprimir(saida);

    }

}
