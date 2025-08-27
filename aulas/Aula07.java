// //Data: 25/06/2025
// //Conteúdo: Variáveis compostas

// /**
//  * 
//  */

// package aulas;

// import utils.IO;

// public class Aula07 {

//     public static void aula() {
//         IO.imprimir("## Aula 07 - VETORES ##");

//         // Exercício 01
//         exemploDeVetores01();

//     }

//     /**
//      * Exemplo de vetores
//      * Descrição do exercício
//      */
//     public static void exemploDeVetores01() {
//         // Variáveis
//         int[] idades;
//         String[] nomes;
//         char[] sexualidade;
//         int qtdPessoas = 0;

//         // Entrada
//         IO.imprimir("Quantas pessoas?");
//         qtdPessoas = IO.lerValorInteiro();
//         idades = new int[qtdPessoas];
//         nomes = new String[qtdPessoas];
//         sexualidade = new char[qtdPessoas];

//         // Leitura dos valores
//         IO.imprimir("");
//         for (int indice = 0; indice < qtdPessoas; indice++) {
//             IO.imprimir("----------------------" );
//             IO.imprimir("Pessoa " + (indice+1) );
//             IO.imprimir("Nome:");
//             nomes[indice] = IO.lerPalavra();
//             IO.imprimir("Idade: ");
//             idades [indice] = IO.lerValorInteiro();
//             IO.imprimir("Sexo:");
//             sexualidade[indice] = IO.lerValorChar();
//         }

        
//         // Processamento
//         // Cálculos realizados

//         // processar();

//         // Saída
//         for (int indice = 0; indice < qtdPessoas; indice++) {
            
//             IO.imprimir("==========================");
//             IO.imprimir("Nome:" + nomes[indice]);
//             IO.imprimir("Idade:" + idades[indice]);
//             IO.imprimir("Sexualidade:" + sexualidade[indice]);
//         }
//     }

//     /**
//      * Descrição do método/função
//      * 
//      * @param param_1 primeiro parâmetro
//      * @param param_2 segundo parâmetro
//      * @return valor retornado
//      */
//     public static int processar(int param_1, int param_2) {

//         return 0;
//     }

// }