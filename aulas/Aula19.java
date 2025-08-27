//Data: 25/08/2025
//Conteúdo: Leitura de arquivos de texto

package aulas;

import utils.IO;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Aula19 {

    public static void aula() {
        System.out.println("\n\n\n===========================================");

        IO.imprimir("\n\n\n## Aula 19 - Leitura de arquivos de texto ##\n\n\n");

        // Exercício 01
        // ler_arquivo_texto();
        // ler_arquivo_texto_completo();
        
        // Esse funciona
         ex03();

        // Esse to fazendo
        // ex03_2();
    }

    public static void ler_arquivo_texto() {
        // Variaveis
        FileReader file_reader = null;
        Scanner reader = null;
        String linha, palavra;
        int valor_inteiro, soma_inteiro = 0;
        double valor_real, soma_real = 0;
        boolean valor_logico;

        try {
            file_reader = new FileReader("entrada/entrada_exemplo.txt");
            reader = new Scanner(file_reader);

        } catch (IOException e) {
            IO.imprimirErro("Erro ao abrir o arquivo");
            e.printStackTrace();
        }

        linha = reader.nextLine();
        IO.imprimir(linha);

        palavra = reader.next();
        IO.imprimir(palavra);
        palavra = reader.next();
        IO.imprimir(palavra);
        palavra = reader.next();
        IO.imprimir(palavra);

        // FECHAMENTO DO ARQUIVO
        try {
            file_reader.close();
            ;
            reader.close();
            ;
        } catch (IOException e) {
            IO.imprimirErro("Erro ao abrir o arquivo");
            e.printStackTrace();
        }

    }

    public static void ler_arquivo_texto_completo() {
        // Variaveis
        FileReader file_reader = null;
        Scanner reader = null;
        String linha, palavra;
        int valor_inteiro, soma_inteiro = 0;
        double valor_real, soma_real = 0;
        boolean valor_logico;

        try {
            file_reader = new FileReader("entrada/entrada_exemplo.txt");
            reader = new Scanner(file_reader);

        } catch (IOException e) {
            IO.imprimirErro("Erro ao abrir o arquivo");
            e.printStackTrace();
        }

        while (reader.hasNext()) {
            if (reader.hasNextInt()) {
                valor_inteiro = reader.nextInt();
                soma_inteiro += valor_inteiro;
                IO.imprimir("INTEIRO: " + valor_inteiro);
            } else if (reader.hasNextDouble()) {
                valor_real = reader.nextDouble();
                soma_real += valor_real;
                IO.imprimir("REAL: " + valor_real);

            } else if (reader.hasNextBoolean()) {
                valor_logico = reader.nextBoolean();
                IO.imprimir("BOOLEANO: " + valor_logico);

            } else {
                palavra = reader.next();
                IO.imprimir("STRING: " + palavra);

            }

        }

        System.out.println("\n\nSoma dos inteiros: " + soma_inteiro);
        System.out.println("\n\nSoma dos reais: " + soma_real);
        // FECHAMENTO DO ARQUIVO
        try {
            file_reader.close();
            ;
            reader.close();
            ;
        } catch (IOException e) {
            IO.imprimirErro("Erro ao abrir o arquivo");
            e.printStackTrace();
        }
    }

    public static void ex03() {

        FileReader file_reader = null;
        FileWriter file_writer = null;
        BufferedWriter writer = null;
        BufferedWriter writer_int = null;
        Scanner reader = null;
        String valor_string = "";
        String valor_logico = "";
        String valor_inteiro = "";
        String valor_real = "";

        try {
            file_reader = new FileReader("entrada/entrada_exemplo.txt");
            reader = new Scanner(file_reader);

            // Abre o arquivo de escrita de inteiros
            // file_writer = new FileWriter("saida/valores_inteiros.txt");
            // writer_int = new BufferedWriter(file_writer);

        } catch (IOException e) {
            IO.imprimirErro("Erro ao abrir o arquivo");
            e.printStackTrace();
        }

        while (reader.hasNext()) {

            if (reader.hasNextInt()) {
                valor_inteiro += reader.next() + " ";
                // writer_int.write("" + valor_inteiro + " ");

            } else if (reader.hasNextDouble()) {
                valor_real += reader.next() + " ";

            } else if (reader.hasNextBoolean()) {
                valor_logico += reader.next() + " ";

            } else {
                valor_string += reader.next() + " ";
            }
        }

        // VALORES INTEIROS
        try {
            // Abre arquivo
            file_writer = new FileWriter("saida/valores_inteiros.txt");
            writer = new BufferedWriter(file_writer);

            // Grava dados
            writer.write(valor_inteiro);
            writer.flush();

            // Fecha arquivo
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // VALORES REAIS
        try {
            // Cria o arquivo
            file_writer = new FileWriter("saida/valores_reais.txt");
            writer = new BufferedWriter(file_writer);

            // Grava dados
            writer.write(valor_real);
            writer.flush();

            // Fecha arquivo
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // VALORES LOGICOS
        try {
            // Cria o arquivo
            file_writer = new FileWriter("saida/valores_logicos.txt");
            writer = new BufferedWriter(file_writer);

            // Grava dados
            writer.write(valor_logico);
            writer.flush();

            // Fecha arquivo
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // VALORES STRING
        try {
            // Cria o arquivo
            file_writer = new FileWriter("saida/valores_cadeias.txt");
            writer = new BufferedWriter(file_writer);

            // Grava dados
            writer.write(valor_string);
            writer.flush();

            // Fecha arquivo
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Exercicio pra criar varios arquivos

    public static void ex03_2() {

        Scanner reader = null;
        BufferedWriter writer_int = null;
        BufferedWriter writer_real = null;
        BufferedWriter writer_logico = null;
        BufferedWriter writer_string = null;
        FileWriter file_writer = null;


        try {
            // Para valores INTEIROS
            file_writer = new FileWriter("saida/valores_inteiros.txt");
            writer_int = new BufferedWriter(file_writer);

        } catch (Exception e) {
            // TODO: handle exception
        }

        while (reader.hasNext()) {
            
        }
    }
}
