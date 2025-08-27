
/*
12. Faça um algoritmo que, para um número indeterminado de pessoas: leia a idade de cada
pessoa, sendo que a idade 0 (zero), ou menor, indica o fim da leitura e não deve ser considerada.
A seguir calcule e imprima:
• O número de pessoas;
• A idade média do grupo;
• A menor idade e a maior idade.
 */
import java.util.Scanner;

public class Ex_12_idade {

    // metodo scanner
    public static Scanner tecladoScanner = new Scanner(System.in);

    // metodo que imprime
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    // metodo que recebe um valor inteiro
    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static void processar() {
        int idade = 0;
        int menorIdade = 999;
        int maiorIdade = 0;
        int somaIdades = 0;
        int qtdPessoas = 0;

        while (true) {

            imprimir("Digite a idade da pessoa " + (qtdPessoas + 1));
            idade = lerValorInteiro();

            if (idade <= 0) {
                break;
            }

            somaIdades = somaIdades + idade;
            qtdPessoas = qtdPessoas + 1;

            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (idade > maiorIdade) {
                maiorIdade = idade;

            }
        }
        if (qtdPessoas == 0) {
            imprimir("Nenhuma idade valida foi adicionada");
        } else {
            double mediaIdade = somaIdades / qtdPessoas;
            imprimir("A media das idades foi: " + mediaIdade);
            imprimir("A maior idade foi: " + maiorIdade);
            imprimir("A menor idade foi: " + menorIdade);
            imprimir("A quantidade de pessoas foi: " + qtdPessoas);
        }

    }

    public static void main(String[] args) {
        processar();

    }

}
