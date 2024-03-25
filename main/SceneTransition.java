package main;

public class SceneTransition {

    MainGame game;

    public SceneTransition(MainGame game) {
        this.game = game;
    }

    public void showMainMenu() {
        game.playMusic(game.mainMenuTheme);
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
    public void showScene3() {
        hideOtherScene(3, 0);
        game.gameUI.messageText.setText("This must be his bedroom");
    }
    public void showScene4() {
        hideOtherScene(4, 0);
        game.gameUI.messageText.setText(". . .");

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

    public void showPhotoAlbum4() {
        if (game.playerFamily.getTommyTalkCounter() >= 9) {
            hideOtherScene(1, 4);
        } else {
            game.event01.lockedPage();
        }
    }
    public void showFlowerField() {
        hideOtherScene(5, 0);
        game.event01.goFlowerField();
    }

    // Second Story
    public void showScene2of1() {
        game.stopMusic(game.mainMenuTheme);
        game.playMusic(game.loveModeTheme);
        hideOtherScene(6, 0);
    }
    public void showScene2of2() {
        hideOtherScene(6, 1);
    }
    public void showScene3of1() {
        hideOtherScene(7, 0);
    }
    public void showScene3of2() {
        hideOtherScene(7, 1);
    }
    public void showScene4of1() {
        hideOtherScene(8, 0);
    }
    public void showScene4of2() {
        hideOtherScene(8, 1);
    }
    public void showScene5of1() {
        game.stopMusic(game.happyTogether);
        game.playMusic(game.loveModeTheme);
        hideOtherScene(9, 0);
    }
    public void showScene5of2() {
        hideOtherScene(9, 1);
    }
    public void showScene6of1() {
        hideOtherScene(10, 0);
    }
    public void showScene6of2() {
        hideOtherScene(10, 1);
    }
    public void showScene7of1() {
        hideOtherScene(11, 0);
    }
    public void showScene7of2() {
        hideOtherScene(11, 1);
    }
    public void showScene8of1() {
        hideOtherScene(12, 0);
    }
    public void showScene8of2() {
        hideOtherScene(12, 1);
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
    public int hideAllScene(int[][] arr) {
        for (int[] row : arr) {
            for (int col : row) {
               return col;
            }
        }
        return 1;
    }
}
