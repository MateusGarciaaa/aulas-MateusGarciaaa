//Data: 03/09/2025
//Conteúdo: File

package aulas;
import utils.IO;
import java.io.File;

public class Aula21 {


    public static void aula(){
        IO.imprimir("## Aula 21 - File ##");
    
        //Exercício 01
        ex01();

    }

    public static void ex01(){
        listarArquivosDentroDeDiretorio();
    }

    /**
    * Descrição do método/função
    * @param param_1 primeiro parâmetro
    * @param param_2 segundo parâmetro
    * @return valor retornado
    */

    public static void listarArquivosDentroDeDiretorio() {
        File dir_atual;

        dir_atual = new File(".");

        File[] arquivos = dir_atual.listFiles();

        if(arquivos != null) {
            for (int idx = 0; idx < arquivos.length; idx++) {
                File arq = arquivos[idx];

                if(arq.isDirectory()) {
                    System.out.println("\n" + arq.getName() + "/: ");
                    listarArquivos(arq.getName());
                } else {
                    System.out.println("\n" + arq.getName());
                }

            }
        }
    }

    public static void listarArquivos(String diretorio){
        File dir_atual;


        //Abre diretório
        dir_atual = new File(diretorio);

        File[] arquivos = dir_atual.listFiles();

        if(arquivos != null) {
            for (int idx = 0; idx < arquivos.length; idx++) {
                File arq = arquivos[idx];
                System.out.println("\tArq: " + arq.getName() + "\t");
            }
        }
    }
}