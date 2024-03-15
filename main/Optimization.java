package main;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Optimization {
    public BufferedImage scaleImage(BufferedImage bf, int width, int height) {
        BufferedImage scaledImage = new BufferedImage(width, height, bf.getType());
        Graphics2D g2 = scaledImage.createGraphics();
        g2.drawImage(bf, 0, 0, width, height, null);
        g2.dispose();

        return scaledImage;
    }
}