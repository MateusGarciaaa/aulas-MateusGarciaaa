package avaliacoes.Rec2;
import utils.IO;
import utils.VETORES;

public class q3 {
    public static void main(String[] args) {
        IO.imprimir("Digite quantos valores o vetor terá");
        int qtdNumeros = IO.lerValorInteiro();
        int[] vetor = new int[qtdNumeros];
        int qtdMaioresQueMedia = 0;

        for(int i = 0; i< qtdNumeros; i++){
            IO.imprimir("Digite o " + (i + 1) + "º numero");
            vetor[i] = IO.lerValorInteiro();
        }

        double media = calcularMediaVetor(vetor);
        
        for(int i = 0; i < qtdNumeros; i++){
            if (media<= vetor[i]) {
                qtdMaioresQueMedia++;
            }
        }

        IO.imprimirValorInteiro(qtdMaioresQueMedia);
        
        
    }


    public static double calcularMediaVetor(int[]vetor){
        double media = 0;
        int somaNumero = 0;
        int qtdNumeros = 0;

        for(int i = 0; i < vetor.length; i++){
            somaNumero = somaNumero + vetor[i];
            qtdNumeros++;
        }

        media = (double) somaNumero/qtdNumeros;
        return media;

    }
}
