package Event;

import main.MainGame;

public class Event01 {
    MainGame game;

    public Event01(MainGame game) {
        this.game = game;
    }

    // Add Action Command Methods
    public void takePhotoAlbum() {
        game.gameUI.messageText.setText("You take a peek at the photo album");
    }



    public void boyTalk() {
        game.gameUI.messageText.setText("Hey, what are you doing here?\n\nMy name is Tommy and I live here alone...");
    }

    public void boyStare() {
        game.gameUI.messageText.setText("You proceed to stare at the boy...\n\n\"WHAT ARE YOU LOOKING AT\"\n\nHow rude of him...");
    }


}
