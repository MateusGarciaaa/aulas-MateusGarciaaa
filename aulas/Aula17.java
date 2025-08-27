//Data: 18/08/2025
//Conteúdo: Registros

package aulas;
import utils.IO;

class Pessoa {
    String nome;
    String data_nascimento;
    String email;
    
    public void imprimir(){
        IO.imprimir("\nNome: " + this.nome);
        IO.imprimir("Data de nascimento: " + this.data_nascimento);
        IO.imprimir("E-mail: " + this.email);
    }

    public void ler(){
        this.nome =IO.lerValorString("Digite o nome da pessoa: ");
        IO.fecharScanner();
        this.data_nascimento =IO.lerValorString("Digite a data de nascimento: ");
        this.email =IO.lerValorString("Digite o email: ");
    }

    

}


public class Aula17 {


    

    public static void aula(){
        IO.imprimir("## Aula 17 ##");
    
        //Exercício 01
        main(null);

    }

    
    public static void ex01(){
        
    }

    public static void main(String[] args) {
        // Pessoa aluno = new Pessoa();
        // aluno.ler();
        // aluno.imprimir();

        int qtdPessoas = IO.lerValorInteiro("Digite quantas pessoas: ");
        IO.limparBuffer();
        Pessoa[] alunos = lerVariasPessoas(qtdPessoas);

        for(int i = 0; i < alunos.length; i++){
            IO.imprimir("Pessoa " + (i+1));
            alunos[i].imprimir();
            IO.imprimir("\n\n");
        }
    }

    public static Pessoa[] lerVariasPessoas(int qtdPessoas){
        Pessoa[] pessoa = new Pessoa[qtdPessoas];
        for(int i = 0; i < pessoa.length; i++){
            pessoa[i] = new Pessoa();
            pessoa[i].ler();
        }
    
        return pessoa;
    }
    
   
    
}