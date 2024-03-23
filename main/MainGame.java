package main;
import Entity.Player;
import Entity.PlayerFamily;
import Event.Event01;

import javax.swing.*;

public class MainGame {

    ActionHandler actionHandler = new ActionHandler(this);
    public GameUI gameUI = new GameUI(this);
    public SceneTransition sceneTransition = new SceneTransition(this);
    public PlayerFamily playerFamily = new PlayerFamily(this);
    public Event01 event01 = new Event01(this);
    public static void main(String[] args) {

        new MainGame();

    }
    public MainGame() {
        sceneTransition.showMainMenu();
    }
}