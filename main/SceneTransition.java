package main;

public class SceneTransition {

    MainGame game;

    public SceneTransition(MainGame game) {
        this.game = game;
    }

    public void showMainMenu() {
        game.gameUI.bgPanel[0].setVisible(true);
        setFalseVisible(1, 3);
        game.gameUI.messageText.setText("Welcome to FUCK ME MAN");
    }
    public void showScene1() {
        game.gameUI.bgPanel[1].setVisible(true);

        setFalseVisible(0, 1);
        setFalseVisible(2, 3);
        game.gameUI.messageText.setText("What an empty room...");
    }
    public void showScene2() {
        game.gameUI.bgPanel[1].setVisible(false);
        game.gameUI.bgPanel[2].setVisible(true);
        game.gameUI.messageText.setText("Why's there so much kitchen appliances?");
    }

    public void setFalseVisible(int start, int end) {
        for (int i = start; i < end; i++) {
            game.gameUI.bgPanel[i].setVisible(false);
        }
    }
}