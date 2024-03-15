package entity;


import main.GameUI;
import main.Optimization;

import javax.imageio.ImageIO;
import java.util.Random;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player extends Entity {
    GameUI gameUI;
    public Player(GameUI gameUI) {
        this.gameUI = gameUI;

        getPlayerImage();

    }

    public void getPlayerImage() {
        clownTest = optimizeImage("HalfnHalf");
    }
    public BufferedImage optimizeImage(String filePath) {
        Optimization optimize = new Optimization();
        BufferedImage image = null;
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/sprites/player/" + filePath + ".png"));
            image = optimize.scaleImage(image, gameUI.getTileSize(), gameUI.getTileSize());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return image;
    }

    public void draw(Graphics2D g2) {
        int xaxis = gameUI.getScreenWidth()/2 - 250;
        int yaxis = gameUI.getScreenHeight()/2 - 250;
        g2.drawImage(clownTest, xaxis, yaxis,500,500,null);
    }

}