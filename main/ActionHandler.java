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
            case "takePhotoAlbum": game.event01.takePhotoAlbum(); game.sceneTransition.showPhotoAlbum(); break;
            case "goPhotoAlbumPage2": game.sceneTransition.showPhotoAlbum2(); break;

            case "boyTalk": game.event01.boyTalk(); break;
            case "boyStare": game.event01.boyStare(); break;


            // Scene Transition Handling
            case "goScene1": game.sceneTransition.showScene1(); break;
            case "goScene2": game.sceneTransition.showScene2(); break;
        }
    }
}
