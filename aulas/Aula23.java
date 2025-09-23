//Data: 10/09/2025
//Conteúdo: Filas

package aulas;

import utils.IO;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

    public static void aula() {
        System.out.println("\n\n\n===========================================");
        IO.imprimir("\n\n\n## Aula 23 - Filas ##\n\n\n");

        // Exercício 01
        // ex01();

        // Exercicio 02
        ex02();

    }

    public static void ex01() {
        Queue<String> fila = new LinkedList<>();

        fila.add("Tiranossauro");
        fila.add("Dodô");
        fila.add("Braquiossauro");
        fila.add("Darlonsauro");

        System.out.println("Fila: " + fila);
        System.out.println("Consultar: " + fila.peek());
        System.out.println("Fila: " + fila);

        IO.divisoria();

        System.out.println("Fila: " + fila);

        IO.divisoria();

        while (!fila.isEmpty()) {
            String valor = fila.poll();
            System.out.println("Valor Retirado: " + valor);
        }

        System.out.println("Fila: " + fila);

    }

    public static void ex02() {
        Queue<String> musica = new LinkedList<>();
        int opcao;
        do {
            System.out.println("=========BEM VINDO AO ISPOTIFAI=========");

            System.out.println("Escolha uma opção: " +
                    "\n 1- Inserir músicas " +
                    "\n 2- Tocar músicas " +
                    "\n 3- Finalizar ISPOTIFAI");
            opcao = IO.lerValorInteiro();

            IO.limparBuffer();

            switch (opcao) {
                case 1:
                    musica = cadastrarMusica();
                    break;

                case 2:
                    tocarMusicas(musica);
                    break;

                case 3:
                    System.out.println("\n\nISPOTIFAI FINALIZANDO...");
                    break;

                default:
                    System.out.println("Opção Inválida, tente novamente");
                    break;
            }

        } while (opcao != 3);

    }

    public static LinkedList<String> cadastrarMusica() {

        LinkedList<String> listaDeMusicas = new LinkedList<>();

        int qtd = IO.lerValorInteiro("Quantas músicas você quer adicionar? ");

        IO.limparBuffer();

        for (int i = 0; i < qtd; i++) {
            listaDeMusicas.add(IO.lerValorString("Digite uma música: "));

        }

        return listaDeMusicas;
    }

    public static void tocarMusicas(Queue<String> musicas) {

        String musicaAdicionada;

        if (musicas.isEmpty()) {
            System.out.println("A playlist está vazia, tente novamente");

        } else {
            while (!musicas.isEmpty()) {
                musicaAdicionada = musicas.poll();
                System.out.println("\n\nTocando: " + musicaAdicionada);

                for (int i = 0; i < 3; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.print("♫");
                    
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("");
    }

}