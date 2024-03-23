package main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameUI {
    MainGame game;
    JFrame window;

    public JTextArea messageText;
    public JPanel[][] bgPanel = new JPanel[20][20];
    public JLabel[][] bgLabel = new JLabel[20][20];

    Font sansSerifButton = new Font("SansSerif", Font.BOLD, 20);

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

    public void createBackground(int bgNum, int sceneNum, String bgFilePath) {
        bgPanel[bgNum][sceneNum] = new JPanel();
        bgPanel[bgNum][sceneNum].setBounds(50,50,1800,650);
        bgPanel[bgNum][sceneNum].setBackground(Color.blue);
        bgPanel[bgNum][sceneNum].setLayout(null);
        window.add(bgPanel[bgNum][sceneNum]);

        bgLabel[bgNum][sceneNum] = new JLabel();
        bgLabel[bgNum][sceneNum].setBounds(0, 0, 1800, 650);

        ImageIcon bgImg = new ImageIcon(getClass().getClassLoader().getResource(bgFilePath));
        Image image = bgImg.getImage().getScaledInstance(1800, 650, Image.SCALE_DEFAULT);

        bgImg = new ImageIcon(image);

        bgLabel[bgNum][sceneNum].setIcon(bgImg);


    }
    public void createObject(int bgNum, int sceneNum, int objx, int objy, int objWid, int objHei, String objFilePath,
                             String action1Name, String action2Name, String action3Name,
                             String action1Command, String action2Command, String action3Command) {
        JPopupMenu popMenu = new JPopupMenu();

        popMenu.setBackground(Color.pink);

        JMenuItem[] menuItem = new JMenuItem[4];


        menuItem[1] = new JMenuItem(action1Name);
        menuItem[1].addActionListener(game.actionHandler);
        menuItem[1].setActionCommand(action1Command);
        menuItem[1].setFont(sansSerifButton);
        menuItem[1].setBorderPainted(false);
        menuItem[1].setBackground(Color.pink);
        popMenu.add(menuItem[1]);

        menuItem[2] = new JMenuItem(action2Name);
        menuItem[2].addActionListener(game.actionHandler);
        menuItem[2].setActionCommand(action2Command);
        menuItem[2].setFont(sansSerifButton);
        menuItem[2].setBorderPainted(false);
        menuItem[2].setBackground(Color.pink);
        popMenu.add(menuItem[2]);

        menuItem[3] = new JMenuItem(action3Name);
        menuItem[3].addActionListener(game.actionHandler);
        menuItem[3].setActionCommand(action3Command);
        menuItem[3].setFont(sansSerifButton);
        menuItem[3].setBorderPainted(false);
        menuItem[3].setBackground(Color.pink);
        popMenu.add(menuItem[3]);

        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(objx, objy, objWid, objHei);

//        For hit box of object
//        objectLabel.setOpaque(true);
//        objectLabel.setBackground(Color.red);

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

        bgPanel[bgNum][sceneNum].add(objectLabel);


    }
    public void createObjectOne(int bgNum, int sceneNum, int objx, int objy, int objWid, int objHei, String objFilePath, String action1Name, String action1Command) {
        JPopupMenu popMenu = new JPopupMenu();

        popMenu.setBackground(Color.pink);

        JMenuItem[] menuItem = new JMenuItem[4];


        menuItem[1] = new JMenuItem(action1Name);
        menuItem[1].addActionListener(game.actionHandler);
        menuItem[1].setActionCommand(action1Command);
        menuItem[1].setFont(sansSerifButton);
        menuItem[1].setBorderPainted(false);
        menuItem[1].setBackground(Color.pink);
        popMenu.add(menuItem[1]);

        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(objx, objy, objWid, objHei);

//        For hit box of object
//        objectLabel.setOpaque(true);
//        objectLabel.setBackground(Color.red);

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

        bgPanel[bgNum][sceneNum].add(objectLabel);


    }


    public void createArrow(int bgNum, int sceneNum, int x, int y, int width, int height, String arrowFilePath, String command) {

        ImageIcon arrowImage = new ImageIcon(getClass().getClassLoader().getResource(arrowFilePath));
        Image image = arrowImage.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);

        arrowImage = new ImageIcon(image);

        JButton arrowButton = new JButton();
        arrowButton.setBounds(x, y, width, height);
        arrowButton.setBackground(null);
        arrowButton.setContentAreaFilled(false);
        arrowButton.setFocusPainted(false);
        arrowButton.setIcon(arrowImage);
        arrowButton.addActionListener(game.actionHandler);
        arrowButton.setActionCommand(command);
        arrowButton.setBorderPainted(false);

        bgPanel[bgNum][sceneNum].add(arrowButton);

    }

    public int getRowLength() {
        return bgPanel.length;
    }
    public int getColLength() {
        return bgPanel[0].length;
    }

    public void buildScreen() {
        // Main Menu
        createBackground(0, 0,"MainMenuBG.png");
        createArrow(0,0,20,0,500,350,"Util/StartButton.png", "goScene1");
        bgPanel[0][0].add(bgLabel[0][0]);

        // Story Select Screen
        createBackground(0, 1, "storySelectScreen.png");
        bgPanel[0][1].add(bgLabel[0][1]);


        // Scene 1
        createBackground(1, 0,"Scene1/BGScene1.png");
        createObject(1, 0,650,200,250,375,"Scene1/BoyLookingAway500x750.png", "TALK", "STARE", "IGNORE", "boyTalk", "boyStare", "boyIgnore");
        createObject(1, 0,1050,320,400,250,"Util/invisibleHitbox.png", "TAKE PHOTO ALBUM", "TAKE NOTEBOOK", "IGNORE", "takePhotoAlbum", "takeNotebook", "cabIgnore");
        createArrow(1, 0, 0,275, 100, 100, "Util/arrowLeft.png", "goScene2");
        bgPanel[1][0].add(bgLabel[1][0]);

        // Photo Album
        createBackground(1, 1, "Scene1/photoAlbum.png");
        createArrow(1, 1, 1700,0, 100,100,"Util/bigX.png", "goScene1");
        createArrow(1, 1, 0, 275, 100, 100, "Util/arrowLeft.png", "goPhotoAlbumPage2");
        bgPanel[1][1].add(bgLabel[1][1]);

        // Photo Album Page 2
        createBackground(1, 2, "Scene1/photoAlbum1.png");
        createArrow(1, 2, 1700,0, 100,100,"Util/bigX.png", "goScene1");
        createArrow(1, 2, 1700, 275, 100, 100, "Util/arrowRight.png", "takePhotoAlbum");
        createArrow(1, 2, 0, 275, 100, 100, "Util/arrowLeft.png", "goPhotoAlbumPage3");
        bgPanel[1][2].add(bgLabel[1][2]);

        // Photo Album Page 3
        createBackground(1, 3, "familyPhoto.png");
        createObjectOne(1, 3, 300, 400, 342, 500, "ghost.png", "QUESTION", "ghostQuestion");
        createArrow(1, 3, 1700,0, 100,100,"Util/bigX.png", "goScene1");
        createArrow(1, 3, 1700, 275, 100, 100, "Util/arrowRight.png", "goPhotoAlbumPage2");

        bgPanel[1][3].add(bgLabel[1][3]);



        // Scene 2
        createBackground(2, 0, "Scene2/KitchenSceneBG.png");
        createObject(2, 0,650,350,670,125, "Util/invisibleHitbox.png", "LIFT", "GRAB", "SHARPEN", "liftKnife", "grabKnife", "sharpenKnife");
        createArrow(2, 0,1700, 275, 100, 100, "Util/arrowRight.png", "goScene1");
        bgPanel[2][0].add(bgLabel[2][0]);
    }
}