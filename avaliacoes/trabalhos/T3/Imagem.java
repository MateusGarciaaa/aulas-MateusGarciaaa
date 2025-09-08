package avaliacoes.trabalhos.T3;

import java.io.File;
import java.io.IOException;

abstract class Imagem {
    int linhas, colunas;
    abstract void rotacaoHorario();
    abstract void espelhamentoHorizontal();
    abstract void espelhamentoVertical();
    abstract void salvar(File arquivo) throws IOException;
}
