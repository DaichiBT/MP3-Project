package main;

import entity.Player;

import java.awt.*;
import javax.swing.*;

public class GameUI extends JPanel implements Runnable {
    private final int initialTileSize = 32;
    private final int scaleValue = 3;
    private final int tileSize = initialTileSize * scaleValue; // 96
    private final int maxScreenCol = 20;
    private final int maxScreenRow = 11;
    private final int screenWidth = tileSize * maxScreenCol; // 768
    private final int screenHeight = tileSize * maxScreenRow; // 576
    private final int FPS = 60;
    Thread gameThread;
    KeyHandler keyHandle = new KeyHandler();

    Player player = new Player(this);
    Sound music = new Sound();
    Sound sfx = new Sound();

    public GameUI() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyHandle);
        this.setFocusable(true);
    }
    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }
    public int getTileSize() {
        return tileSize;
    }
    public int getMaxScreenCol() {
        return maxScreenCol;
    }
    public int getMaxScreenRow() {
        return maxScreenRow;
    }
    public int getScreenWidth() {
        return screenWidth;
    }
    public int getScreenHeight() {
        return screenHeight;
    }
    public int getMaxWorldCol() {
        return 50;
    }
    public int getMaxWorldRow() {
        return 50;
    }
    @Override

    public void run() {
        double drawInterval = 1000/FPS;
        double delta = 0;
        long lastTime = System.currentTimeMillis();
        long currentTime;
        long timer = 0;
        int drawCount = 0;

        while(gameThread != null) {
            currentTime = System.currentTimeMillis();
            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                repaint();
                delta--;
                drawCount++;
            }

            if (timer >= 1000) {
                // System.out.println("FPS: " + drawCount);
                drawCount = 0;
                timer = 0;
            }
        }
    }
    public void update() {

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        player.draw(g2);

        g2.dispose();
    }
    public void playMusic(int i) {
        music.setFile(i);
        music.play();
        music.loop();
    }
    public void stopMusic() {
        music.stop();
    }
    public void playSFX(int i) {
        sfx.setFile(i);
        sfx.play();
    }
    public String toString() {
        return FPS + "";
    }
}