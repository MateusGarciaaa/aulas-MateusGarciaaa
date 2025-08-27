//Data: 27/08/2025
//Conteúdo: Leitura e escrita de arquivo binário

package aulas;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import utils.IO;

public class Aula20 {


    public static void aula(){
        IO.imprimir("## Aula 20 - Arquivo binário ##");
    
        //Exercício 01
        ex01();

    }

    /**
    * Título do exercício
    * Descrição do exercício
    */
    public static void ex01(){
        //Variáveis
        String nome_arquivo = "saida/dados.bin";

        //Leitura de arquivo binário
        FileInputStream file_reader = null;
        DataInputStream reader = null;

        //Escrita de arquivo binário
        FileOutputStream file_writer = null;
        DataOutputStream writer = null;


        // escrita
        try{
            file_writer = new FileOutputStream(nome_arquivo);
            writer = new DataOutputStream(file_writer);

            writer.writeInt(42000000);
            writer.writeDouble(3.14);
            writer.writeUTF("teste");

            writer.close();
            file_writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // leitura
        try {
            file_reader = new FileInputStream(nome_arquivo);
            reader = new DataInputStream(file_reader);

            int valor_int = reader.readInt();
            double valor_double = reader.readDouble();
            String valor_string = reader.readUTF();
            IO.imprimir(""+valor_int + " " + valor_double + " " + valor_string);

            reader.close();
            file_reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    

}