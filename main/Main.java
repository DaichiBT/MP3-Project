package main;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Pixel Monster");

        GameUI gameUI = new GameUI();
        System.out.println(gameUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gameUI);
        frame.setResizable(false);

        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        gameUI.startGameThread();

    }
}