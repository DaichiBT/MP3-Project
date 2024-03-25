package Event;
import main.MainGame;

public class Event02 {
    MainGame game;

    public Event02(MainGame game) {
        this.game = game;
    }

    // Generic Choice
    public void choice1of1() {
        game.gameUI.messageText.setText("Not a bad choice!");
    }
    public void choice1of2() {
        game.gameUI.messageText.setText("She's disappointed that you don't know who she is and blocks you...");
    }
    public void choice1of3() {
        game.gameUI.messageText.setText("She's super happy that you seem to recognize who she is!");
    }

    public void choice2of1() {
        game.gameUI.messageText.setText("She gives a look of disgust and proceeds to ghost you for the rest of her life...");
    }
    public void choice2of2() {
        game.gameUI.messageText.setText("She seems to be super happy that you don't know what League is and you guys kick it off to a great start!");
    }
    public void choice2of3() {
        game.gameUI.messageText.setText("She's satisfied with that answer!");
    }

    public void choice3of1() {
        game.stopMusic(game.loveModeTheme);
        game.playMusic(game.countryRoad);
        game.gameUI.messageText.setText("She loves this timeless classic!");
    }
    public void choice3of2() {
        game.gameUI.messageText.setText("She seems concerned for you...");
    }
    public void choice3of3() {
        game.stopMusic(game.loveModeTheme);
        game.playMusic(game.happyTogether);
        game.gameUI.messageText.setText("She finds the song romantic and loves it!");
    }

    public void choice4of1() {
        game.gameUI.messageText.setText("She becomes upset because you've been taking her to McDonalds for the past few months...\n\nShe dumps you...");
    }
    public void choice4of2() {
        game.gameUI.messageText.setText("She's super excited and even offers to pay for the tickets!");
    }
    public void choice4of3() {
        game.gameUI.messageText.setText("Surprisingly she's not too disappointed in this and is excited to play games with you!");
    }

    public void choice5of1() {
        game.gameUI.messageText.setText("She's super happy you chose a game that requires teamwork!\n\nYou guys have a blast and proceed to get married after playing one game!");
    }
    public void choice5of2() {
        game.gameUI.messageText.setText("She laughs at you for wanting to play a game with a player hitbox larger than the player base\n\n(Overwatch players are cool though)");
    }
    public void choice5of3() {
        game.gameUI.messageText.setText("She's happy that she's talking to a person with an AMAZING taste in games! ");
    }

    public void choice6of1() {
        game.gameUI.messageText.setText("She's happy that you're getting her pizza!");
    }
    public void choice6of2() {
        game.gameUI.messageText.setText("She's super impressed by your cooking skills and is extremely happy!");
    }
    public void choice6of3() {
        game.gameUI.messageText.setText("She looks at you disappointed and breaks up...\n\nYou lose your friends too...");
    }

    public void choice7of1() {
        game.gameUI.messageText.setText("Today was in fact not your anniversary date...\n\nYou end up buying a bunch of gifts thinking you forgot about your anniversary. You take a debt of $200,000 and she proceeds to leave you...\n\nYou end up with " + game.playerLove.getLovePoints() + " points");
    }
    public void choice7of2() {
        game.gameUI.messageText.setText("Today was in fact not her birthday...\n\nYou end up embarrassing yourself by posting a birthday post on your instagram...\n\nYou end up with " + game.playerLove.getLovePoints() + " points");
    }
    public void choice7of3() {
        game.gameUI.messageText.setText("It is in fact Monday!\n\nYou end up with " + game.playerLove.getLovePoints() + " points");
    }
}
