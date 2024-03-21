package main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameUI {
    MainGame game;
    JFrame window;
    public JTextArea messageText;
    public JPanel[] bgPanel = new JPanel[20];
    public JLabel[] bgLabel = new JLabel[20];

    public GameUI(MainGame game) {
        this.game = game;

        createGameFrame();
        buildScreen();

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

        messageText.setBackground(Color.black);
        messageText.setForeground(Color.white);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Book Antiqua", Font.PLAIN, 36));
        window.add(messageText);
    }

    public void createBackground(int bgNum, String bgFilePath) {
        bgPanel[bgNum] = new JPanel();
        bgPanel[bgNum].setBounds(50,50,1800,650);
        bgPanel[bgNum].setBackground(Color.blue);
        bgPanel[bgNum].setLayout(null);
        window.add(bgPanel[1]);

        bgLabel[bgNum] = new JLabel();
        bgLabel[bgNum].setBounds(0, 0, 1800, 650);

        ImageIcon bgImg = new ImageIcon(getClass().getClassLoader().getResource(bgFilePath));
        Image image = bgImg.getImage().getScaledInstance(1800, 650, Image.SCALE_DEFAULT);

        bgImg = new ImageIcon(image);

        bgLabel[bgNum].setIcon(bgImg);


    }
    public void createObject(int bgNum, int objx, int objy, int objWid, int objHei, String objFilePath,
                             String action1Name, String action2Name, String action3Name,
                             String action1Command, String action2Command, String action3Command) {
        JPopupMenu popMenu = new JPopupMenu();

        JMenuItem[] menuItem = new JMenuItem[4];
        menuItem[1] = new JMenuItem(action1Name);
        menuItem[1].addActionListener(game.actionHandler);
        menuItem[1].setActionCommand(action1Command);
        popMenu.add(menuItem[1]);

        menuItem[2] = new JMenuItem(action2Name);
        menuItem[2].addActionListener(game.actionHandler);
        menuItem[2].setActionCommand(action2Command);
        popMenu.add(menuItem[2]);

        menuItem[3] = new JMenuItem(action3Name);
        menuItem[3].addActionListener(game.actionHandler);
        menuItem[3].setActionCommand(action3Command);
        popMenu.add(menuItem[3]);

        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(objx, objy, objWid, objHei);

        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFilePath));
        Image image = objectIcon.getImage().getScaledInstance(objWid,objHei, Image.SCALE_DEFAULT);

        objectIcon = new ImageIcon(image);

        objectLabel.setIcon(objectIcon);

        objectLabel.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {

            }
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    popMenu.show(objectLabel, e.getX(), e.getY());
                }
            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {

            }
            public void mouseExited(MouseEvent e) {

            }
        });

        bgPanel[bgNum].add(objectLabel);
        bgPanel[bgNum].add(bgLabel[bgNum]);

    }

    public void buildScreen() {
        createBackground(1, "KitchenSceneBG.png");
        createObject(1,1300,200,200,200,"kitchenObj1.png", "EAT", "WHINE", "SHINE",
                "EAT UTIL", "WHINE UTIL", "SHINE UTIL");
    }
}