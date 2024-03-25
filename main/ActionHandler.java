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
            case "goPhotoAlbumPage3": game.sceneTransition.showPhotoAlbum3(); break;
            case "goPhotoAlbumPage4": game.sceneTransition.showPhotoAlbum4(); break;
            case "goFlowerField": game.sceneTransition.showFlowerField(); break;

            case "boyTalk": game.event01.boyTalk(); break;
            case "boyStare": game.event01.boyStare(); break;

            case "ghostQuestion": game.event01.ghostQuestion(); break;

            case "liftKnife": game.event01.liftKnife(); break;
            case "grabKnife": game.event01.grabKnife(); break;
            case "sharpenKnife": game.event01.sharpenKnife(); break;

            case "inspectBag": game.event01.inspectBag(); break;
            case "grabBag": game.event01.grabBag(); break;

            case "inspectTombOne": game.event01.inspectTombOne(); break;
            case "inspectTombTwo": game.event01.inspectTombTwo(); break;
            case "inspectTombThree": game.event01.inspectTombThree(); break;

            // Scene Transition Handling
            case "endGameMode": game.stopMusic(game.loveModeTheme); game.sceneTransition.showMainMenu(); break;
            case "goMainMenu": game.sceneTransition.showMainMenu(); game.playerFamily.resetVars(); game.playerFamily.resetVars(); break;
            case "goStorySelect": game.sceneTransition.showStorySelect(); break;
            case "goScene1First": game.sceneTransition.showScene1(); game.stopMusic(game.mainMenuTheme); game.playMusic(game.storyOneTheme); break;
            case "goScene1": game.sceneTransition.showScene1(); break;
            case "goScene2": game.sceneTransition.showScene2(); break;
            case "goScene3": game.sceneTransition.showScene3(); break;
            case "goScene4": game.sceneTransition.showScene4(); game.event01.exploreGrave(); break;

            case "goLoveStory": game.sceneTransition.showScene2of1(); game.gameUI.messageText.setText("Welcome to the Minigame!\n\nIn this game mode you will be receiving a text from a girl. The goal of the game is to respond to that text selecting the best choice."); break;
            case "goScenario2": game.sceneTransition.showScene3of1(); game.gameUI.messageText.setText("Scenario #2"); break;
            case "goScenario3": game.sceneTransition.showScene4of1(); game.gameUI.messageText.setText("Scenario #3"); break;
            case "goScenario4": game.sceneTransition.showScene5of1(); game.gameUI.messageText.setText("Scenario #4"); break;
            case "goScenario5": game.sceneTransition.showScene6of1(); game.gameUI.messageText.setText("Scenario #5"); break;
            case "goScenario6": game.sceneTransition.showScene7of1(); game.gameUI.messageText.setText("Scenario #6"); break;
            case "goScenario7": game.sceneTransition.showScene8of1(); game.gameUI.messageText.setText("Scenario #7"); break;

            // Text Choices
            case "choice1of1": game.playerLove.setLovePoints(1); game.event02.choice1of1(); game.sceneTransition.showScene2of2(); break;
            case "choice1of2": game.playerLove.setLovePoints(0); game.event02.choice1of2(); game.sceneTransition.showScene2of2(); break;
            case "choice1of3": game.playerLove.setLovePoints(2); game.event02.choice1of3(); game.sceneTransition.showScene2of2(); break;

            case "choice2of1": game.playerLove.setLovePoints(0); game.event02.choice2of1(); game.sceneTransition.showScene3of2(); break;
            case "choice2of2": game.playerLove.setLovePoints(2); game.event02.choice2of2(); game.sceneTransition.showScene3of2(); break;
            case "choice2of3": game.playerLove.setLovePoints(1); game.event02.choice2of3(); game.sceneTransition.showScene3of2(); break;

            case "choice3of1": game.playerLove.setLovePoints(2); game.event02.choice3of1(); game.sceneTransition.showScene4of2(); break;
            case "choice3of2": game.playerLove.setLovePoints(0); game.event02.choice3of2(); game.sceneTransition.showScene4of2(); break;
            case "choice3of3": game.playerLove.setLovePoints(1); game.event02.choice3of3(); game.sceneTransition.showScene4of2(); break;

            case "choice4of1": game.playerLove.setLovePoints(0); game.event02.choice4of1(); game.sceneTransition.showScene5of2(); break;
            case "choice4of2": game.playerLove.setLovePoints(2); game.event02.choice4of2(); game.sceneTransition.showScene5of2(); break;
            case "choice4of3": game.playerLove.setLovePoints(1); game.event02.choice4of3(); game.sceneTransition.showScene5of2(); break;

            case "choice5of1": game.playerLove.setLovePoints(2); game.event02.choice5of1(); game.sceneTransition.showScene6of2(); break;
            case "choice5of2": game.playerLove.setLovePoints(0); game.event02.choice5of2(); game.sceneTransition.showScene6of2(); break;
            case "choice5of3": game.playerLove.setLovePoints(1); game.event02.choice5of3(); game.sceneTransition.showScene6of2(); break;

            case "choice6of1": game.playerLove.setLovePoints(1); game.event02.choice6of1(); game.sceneTransition.showScene7of2(); break;
            case "choice6of2": game.playerLove.setLovePoints(2); game.event02.choice6of2(); game.sceneTransition.showScene7of2(); break;
            case "choice6of3": game.playerLove.setLovePoints(0); game.event02.choice6of3(); game.sceneTransition.showScene7of2(); break;

            case "choice7of1": game.playerLove.setLovePoints(0); game.event02.choice7of1(); game.sceneTransition.showScene8of2(); break;
            case "choice7of2": game.playerLove.setLovePoints(0); game.event02.choice7of2(); game.sceneTransition.showScene8of2(); break;
            case "choice7of3": game.playerLove.setLovePoints(3); game.event02.choice7of3(); game.sceneTransition.showScene8of2(); break;

        }
    }
}
