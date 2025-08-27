package utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import utils.Pixel;

public class ImagePixels {
        private static BufferedImage img;

        public ImagePixels(BufferedImage img) {
            this.img = img;
        }

        public static Pixel pixel(int x, int y) {
            checarBordas(x, y);
            return new Pixel(img, x, y);
        }

        public static int getLargura()  { 
            return img.getWidth(); 
        }
        public static int getAltura() { 
            return img.getHeight(); 
        }

        private static void checarBordas(int x, int y) {
            if (x < 0 || x >= img.getWidth() || y < 0 || y >= img.getHeight()) {
                throw new IndexOutOfBoundsException(
                    "Coordenadas fora da imagem: (" + x + "," + y + ")"
                );
            }
        }
    }