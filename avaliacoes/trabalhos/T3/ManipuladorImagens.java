package avaliacoes.trabalhos.T3;

import java.io.*;
import java.util.*;

// Classe principal
public class ManipuladorImagens {

    public static void main(String[] args) {
        try {
            // 1️⃣ Listar arquivos no diretório "entradas"
            File dir = new File("entradas");
            File[] arquivos = dir.listFiles((d, nome) -> nome.endsWith(".pbm") || nome.endsWith(".pgm") || nome.endsWith(".ppm"));

            if (arquivos == null || arquivos.length == 0) {
                System.out.println("Nenhum arquivo encontrado no diretório entradas.");
                return;
            }

            System.out.println("Arquivos encontrados:");
            for (int i = 0; i < arquivos.length; i++) {
                System.out.println((i + 1) + ". " + arquivos[i].getName());
            }

            // 2️⃣ Usuário escolhe o arquivo
            Scanner sc = new Scanner(System.in);
            System.out.print("Escolha um arquivo pelo número: ");
            int escolha = sc.nextInt() - 1;

            if (escolha < 0 || escolha >= arquivos.length) {
                System.out.println("Escolha inválida.");
                sc.close();
                return;
            }

            File arquivoEscolhido = arquivos[escolha];

            // 3️⃣ Ler a imagem
            Imagem img = lerImagem(arquivoEscolhido);

            if (img == null) {
                System.out.println("Erro ao ler a imagem.");
                sc.close();
                return;
            }

            // 4️⃣ Aplicar operações
            img.rotacaoHorario();
            img.salvar(new File("saidas/rotacao" + getExtensao(arquivoEscolhido)));

            img = lerImagem(arquivoEscolhido); // recarregar original
            img.espelhamentoHorizontal();
            img.salvar(new File("saidas/horizontal" + getExtensao(arquivoEscolhido)));

            img = lerImagem(arquivoEscolhido); // recarregar original
            img.espelhamentoVertical();
            img.salvar(new File("saidas/vertical" + getExtensao(arquivoEscolhido)));

            System.out.println("Operações concluídas! Arquivos salvos na pasta 'saidas'.");
            sc.close();

        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Retorna a extensão do arquivo (.pbm, .pgm, .ppm)
    private static String getExtensao(File arquivo) {
        String nome = arquivo.getName();
        return nome.substring(nome.lastIndexOf("."));
    }

    // Função que lê a imagem e retorna um objeto Imagem adequado
    private static Imagem lerImagem(File arquivo) throws IOException {
        Scanner sc = new Scanner(new FileReader(arquivo));
        String tipo = sc.nextLine().trim(); // P1, P2 ou P3
        int colunas = sc.nextInt();
        int linhas = sc.nextInt();
        int max = 1; // default PBM
        if (tipo.equals("P2") || tipo.equals("P3")) max = sc.nextInt(); // ignorar 255

        Imagem img = null;

        if (tipo.equals("P1")) img = new ImagemPBM(linhas, colunas, sc);
        else if (tipo.equals("P2")) img = new ImagemPGM(linhas, colunas, sc);
        else if (tipo.equals("P3")) img = new ImagemPPM(linhas, colunas, sc);

        sc.close();
        return img;
    }
}