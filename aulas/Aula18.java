
//Data: 20/08/2025  
//Conteúdo: Arquivos de texto


/**
 * é como se tivesse um println, porém salva em um arquivo de 
 * texto para salvar as respostas ao invés de mostrar no terminal
 */
package aulas;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import utils.IO;

public class Aula18 {


    public static void aula(){
        IO.imprimir("## Aula 18 - Arquivos de Texto ##");
    
        //Exercício 01
        //ex01();
        //Exercício 02
        ex02();

    }

    
    public static void ex01(){
        BufferedWriter writer = null;
        FileWriter file_writer = null;


        //Gera o arquivo
        try{
            file_writer = new FileWriter("numeros.txt");
            writer = new BufferedWriter(file_writer);
        } catch(IOException e){
            e.printStackTrace();
        }

        


        //Salva dados no arquivo

        try {
            for(int i = 1; i <= 10; i++){
            writer.write("" + i);
            writer.newLine();

            }
           

           writer.close();
           file_writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    
    public static void ex02(){
        BufferedWriter writer = null;
        FileWriter file_writer = null;

        String nome = IO.lerValorString("Digite o seu nome: ");
        int valorUm = IO.lerValorInteiro("Digite um numero: ");
        int valorDois = IO.lerValorInteiro("Digite um numero: ");

        //Gera o arquivo
   
        


        //Salva dados no arquivo

        try {
            file_writer = new FileWriter("saida/" + nome + ".txt");
            writer = new BufferedWriter(file_writer);
            for(; valorUm <= valorDois; valorUm++){
            writer.write("" + valorUm);
            writer.newLine();

            }
           

           writer.close();
           file_writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}