package Event;

import main.MainGame;

public class Event01 {
    MainGame game;

    public Event01(MainGame game) {
        this.game = game;
    }

    // Add Action Command Methods
    public void eatUtil() {
        game.gameUI.messageText.setText("OM NOM O NO M ONONM MO ODNMAO DNO M NOM NOM NOMONOM OM O NWAAAAAAAAAAAAAAAAAAAAAAAA O OM OM");
    }

    public void shineUtil() {
        game.gameUI.messageText.setText("SHINING LIKE A DIAMOND");
    }

}
