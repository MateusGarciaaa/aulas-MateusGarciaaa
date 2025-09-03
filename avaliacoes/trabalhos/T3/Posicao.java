package avaliacoes.trabalhos.T3;

public class Posicao {

    int linha;
    int coluna;
    

    public int[] resultado(){
        int[] valor = new int[2];


        valor[1] = this.linha;
        valor[2] = this.coluna;

        return valor;
    }
}