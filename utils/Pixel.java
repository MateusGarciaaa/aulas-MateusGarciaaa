package utils;

import java.awt.image.BufferedImage;

public class Pixel {
            private int x, y;
            private final BufferedImage img;

            public Pixel(BufferedImage img, int x, int y) {
                this.img = img;
                this.x = x;
                this.y = y;
            }

            // --- GETTERS ---
            public int getARGB()      { return img.getRGB(x, y); }
            public int getAlpha()     { return (getARGB() >>> 24) & 0xFF; }
            public int getRed()       { return (getARGB() >>> 16) & 0xFF; }
            public int getGreen()     { return (getARGB() >>> 8)  & 0xFF; }
            public int getBlue()      { return  getARGB()         & 0xFF; }

            // --- SETTERS ---
            public void setARGB(int a, int r, int g, int b) {
                int aa = clamp(a), rr = clamp(r), gg = clamp(g), bb = clamp(b);
                int argb = (aa << 24) | (rr << 16) | (gg << 8) | bb;
                img.setRGB(x, y, argb);
            }

            public void setAlpha(int a) {
                int argb = getARGB();
                argb = (argb & 0x00FFFFFF) | (clamp(a) << 24);
                img.setRGB(x, y, argb);
            }

            public void setRed(int r) {
                int argb = getARGB();
                argb = (argb & 0xFF00FFFF) | (clamp(r) << 16);
                img.setRGB(x, y, argb);
            }

            public void setGreen(int g) {
                int argb = getARGB();
                argb = (argb & 0xFFFF00FF) | (clamp(g) << 8);
                img.setRGB(x, y, argb);
            }

            public void setBlue(int b) {
                int argb = getARGB();
                argb = (argb & 0xFFFFFF00) | clamp(b);
                img.setRGB(x, y, argb);
            }

            private int clamp(int v) {
                return (v < 0) ? 0 : (v > 255) ? 255 : v;
            }
        }
    