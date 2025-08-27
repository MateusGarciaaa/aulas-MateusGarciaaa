package aulas;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import utils.ImagePixels;
import utils.Pixel;
import utils.IO;

public class Imagem {

    public static void aula() {
        System.out.println("Aula de Matrizes - Manipulação de Imagens Pixel a Pixel");

        //Modifica uma imagem
        modificarImagemTeste("cachorro.jpg", "imagem_saida.png");
    }

    public static void modificarImagemTeste(String nome_imagem_entrada, String nome_imagem_saida){

        try {
            // Carrega o arquivo com a imagem
            BufferedImage img = ImageIO.read(new File(nome_imagem_entrada));

            ImagePixels ip = new ImagePixels(img);


            int altura  = ImagePixels.getAltura();
            int largura = ImagePixels.getLargura();




            for(int x = 1; x < largura - 1; x++){
                for(int y = 1; y < altura-1; y ++){
                    Pixel p = ip.pixel(x, y);
                    Pixel cima = ip.pixel(x, y + 1);
                    Pixel baixo = ip.pixel(x, y - 1);
                    Pixel esquerda = ip.pixel(x - 1, y);
                    Pixel direita = ip.pixel(x + 1, y);

                    int media_red = (cima.getRed() + baixo.getRed() + esquerda.getRed() + direita.getRed()) / 4;
                    int media_green = (cima.getGreen() + baixo.getGreen() + esquerda.getGreen() + direita.getGreen()) / 4;
                    int media_blue = (cima.getBlue() + baixo.getBlue() + esquerda.getBlue() + direita.getBlue()) / 4;

                    p.setRed(media_red);
                    p.setGreen(media_green);
                    p.setBlue(media_blue);

                    
                }
            }
            ImageIO.write(img, "png", new File(nome_imagem_saida));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}