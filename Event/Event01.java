package Event;

import main.MainGame;

public class Event01 {
    MainGame game;

    public Event01(MainGame game) {
        this.game = game;
    }

    // Add Action Command Methods
    public void takePhotoAlbum() {
        game.playerFamily.setCheckedPhotoAlbum(true);
        game.gameUI.messageText.setText("You take a peek at the photo album");
    }

    public void ghostQuestion() {
        game.gameUI.messageText.setText("What is this thing...\n\nI better figure this shit out!");
    }



    public void boyTalk() {
        switch (game.playerFamily.getTommyTalkCounter()) {
            case 0:
                game.gameUI.messageText.setText("Hey, what are you doing here?\n\nMy name is Tommy and I live here alone...");
                game.playerFamily.setTommyTalkCounter();
                break;
            case 1:
                game.gameUI.messageText.setText("I can really use your help. I lost my memory a few days ago and I just woke up here...\n\nThere might be something in the drawers...");
                game.playerFamily.setTommyTalkCounter();
                break;
            case 2:
                if (!(game.playerFamily.getCheckedPhotoAlbum())) {
                    game.gameUI.messageText.setText("CHECK THE DRAWERS");
                } else {
                    game.gameUI.messageText.setText("Are those my family...\n\nWhere could they have gone?");
                    game.playerFamily.setTommyTalkCounter();
                }
                break;
            case 3:
                if (!(game.playerFamily.getKnifeLifted())) {
                    game.gameUI.messageText.setText("Well thanks for finding these photos...\n\nI'm starting to remember I had a mom, a dad, and a sister...\n\nI think I remember my mom always left a note in the kitchen, can you go find it for me?");
                } else {
                    game.gameUI.messageText.setText("Thank you for finding the note...");
                    game.playerFamily.setTommyTalkCounter();
                }
            case 4:


            default:
                // Handle default case if needed
                break;
        }
    }

    public void boyStare() {
        game.gameUI.messageText.setText("You proceed to stare at the boy...\n\n\"WHAT ARE YOU LOOKING AT\"\n\nHow rude of him...");
    }

    public void liftKnife() {
        if (game.playerFamily.getTommyTalkCounter() >= 3) {
            game.gameUI.messageText.setText("You lift the knife and find a hidden note underneath...\n\nThis must be what he's talking about, time to bring it back to him");
            game.playerFamily.setKnifeLifted(true);
        } else {
            game.gameUI.messageText.setText("You lift the knife and find a hidden note underneath...\n\nI wonder what this can be used for...");
        }
    }
}
