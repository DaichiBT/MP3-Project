package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {
    MainGame game;
    public ActionHandler(MainGame game) {
        this.game = game;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String playerChoice = e.getActionCommand();

        switch(playerChoice) {
            case "EAT UTIL": game.event01.eatUtil(); break;
            case "WHINE UTIL": game.event01.shineUtil(); break;
            case "SHINE UTIL": break;
        }
    }
}
