package main;


import javax.swing.*;
import java.awt.*;

public class GameUI {
    MainGame game;
    JFrame window;
    public JTextArea messageText;
    public JPanel[] bgPanel = new JPanel[20];
    public JLabel[] bgLabel = new JLabel[20];

    public GameUI(MainGame game) {
        this.game = game;

        createGameFrame();
        createBackground();
        createObject();

        window.setVisible(true);
    }

    public void createGameFrame() {
        window = new JFrame();
        window.setSize(1920, 1080);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setResizable(false);
        window.setLayout(null);

        messageText = new JTextArea("");
        messageText.setBounds(50,700,1800,300);

        messageText.setBackground(Color.red);
        messageText.setForeground(Color.white);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Book Antiqua", Font.PLAIN, 36));
        window.add(messageText);
    }

    public void createBackground() {
        bgPanel[1] = new JPanel();
        bgPanel[1].setBounds(50,50,1800,650);
        bgPanel[1].setBackground(Color.blue);
        bgPanel[1].setLayout(null);
        window.add(bgPanel[1]);

        bgLabel[1] = new JLabel();
        bgLabel[1].setBounds(0, 0, 1800, 650);

        ImageIcon bgImg = new ImageIcon(getClass().getClassLoader().getResource("MainMenuBG.png"));
        Image image = bgImg.getImage().getScaledInstance(1800, 650, Image.SCALE_DEFAULT);

        bgImg = new ImageIcon(image);

        bgLabel[1].setIcon(bgImg);


    }
    public void createObject() {
        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(300,50,320,320);

        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource("level-up.png"));
        Image image = objectIcon.getImage().getScaledInstance(320,320, Image.SCALE_DEFAULT);

        objectIcon = new ImageIcon(image);

        objectLabel.setIcon(objectIcon);

        bgPanel[1].add(objectLabel);
        bgPanel[1].add(bgLabel[1]);

    }
}