package main;

public class SceneTransition {

    MainGame game;

    public SceneTransition(MainGame game) {
        this.game = game;
    }

    public void showMainMenu() {
        hideOtherScene(0,0);
        game.gameUI.messageText.setText("Welcome to Resolve");
    }
    public void showStorySelect() {
        hideOtherScene(0, 1);
        game.gameUI.messageText.setText("Please Select a Story to Play");
    }
    public void showScene1() {
        hideOtherScene(1,0);

        game.gameUI.messageText.setText("What an empty room...");
    }
    public void showScene2() {
        hideOtherScene(2, 0);
        game.gameUI.messageText.setText("Why's there so much kitchen appliances?\n\nThis must be where Tommy's family lived...");
    }

    public void showPhotoAlbum() {
        hideOtherScene(1, 1);
    }

    public void showPhotoAlbum2() {
        hideOtherScene(1, 2);
    }

    public void showPhotoAlbum3() {
        hideOtherScene(1, 3);
    }

    public void hideOtherScene(int exclusionRow, int exclusionCol) {
        for (int row = 0; row < game.gameUI.getRowLength(); row++) {
            for (int col = 0; col < game.gameUI.getColLength(); col++) {
                if (game.gameUI.bgPanel[row][col] != null) {
                    game.gameUI.bgPanel[row][col].setVisible(false);
                }
            }
        }
        game.gameUI.bgPanel[exclusionRow][exclusionCol].setVisible(true);
    }
}
