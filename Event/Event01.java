package Event;

import main.MainGame;

public class Event01 {
    MainGame game;

    public Event01(MainGame game) {
        this.game = game;
    }

    // Add Action Command Methods
    public void takePhotoAlbum() {
        if (game.playerFamily.getTommyTalkCounter() >= 1) {
            game.playerFamily.setCheckedPhotoAlbum(true);
        }
        game.gameUI.messageText.setText("You take a peek at the photo album");
    }

    public void ghostQuestion() {
        game.gameUI.messageText.setText("What is this thing...");
    }

    public void lockedPage() {
        game.gameUI.messageText.setText("You can't access this page yet...");
    }

    public void boyTalk() {
        switch (game.playerFamily.getTommyTalkCounter()) {
            case 0:
                game.playSound(game.tommyVoice1);
                game.gameUI.messageText.setText("Tommy - \n\"Hey, what are you doing here?\"\n\n\"My name is Tommy and I live here alone...\"");
                game.playerFamily.setTommyTalkCounter();
                break;
            case 1:
                game.stopSound(game.tommyVoice1);
                game.playSound(game.tommyVoice2);
                game.gameUI.messageText.setText("Tommy - \n\"I can really use your help. I lost my memory a few days ago and I just woke up here...\"\n\n\"There might be something in the drawers...\"");
                game.playerFamily.setTommyTalkCounter();
                break;
            case 2:
                if (!(game.playerFamily.getCheckedPhotoAlbum())) {
                    game.gameUI.messageText.setText("CHECK THE DRAWERS");
                } else {
                    game.stopSound(game.tommyVoice2);
                    game.playSound(game.tommyVoice3);
                    game.gameUI.messageText.setText("Tommy - \n\"Are those my family...\"\n\n\"Where could they have gone?\"");
                    game.playerFamily.setTommyTalkCounter();
                }
                break;
            case 3:
                if (!(game.playerFamily.getKnifeLifted())) {
                    game.stopSound(game.tommyVoice3);
                    game.playSound(game.tommyVoice4);
                    game.gameUI.messageText.setText("Tommy - \n\"Well thanks for finding these photos...\"\n\n\"I'm starting to remember I had a mom, a dad, and a sister...\"\n\n\"I think I remember my mom always left a note in the kitchen, can you go find it for me?\"");
                } else {
                    game.stopSound(game.tommyVoice4);
                    game.playSound(game.tommyVoice5);
                    game.gameUI.messageText.setText("Tommy - \n\"Thank you for finding the note...\"");
                    game.playerFamily.setTommyTalkCounter();
                }
                break;
            case 4:
                game.stopSound(game.tommyVoice5);
                game.playSound(game.tommyNote);
                game.gameUI.messageText.setText("Note -\nDear Tommy,\n\nI left some snacks for you in your bedroom...");
                game.playerFamily.setTommyTalkCounter();
                break;
            case 5:
                if (!(game.playerFamily.getGrabbedBag())) {
                    game.stopSound(game.tommyNote);
                    game.playSound(game.tommyVoice6);
                    game.gameUI.messageText.setText("Tommy - \n\"Hey, do you think you can go find the snacks in my room?\"");
                } else {
                    game.stopSound(game.tommyVoice6);
                    game.playSound(game.tommyVoice7);
                    game.gameUI.messageText.setText("Tommy - \n\"Thank you, once again...\"");
                    game.playerFamily.setTommyTalkCounter();
                }
                break;
            case 6:
                game.stopSound(game.tommyVoice7);
                game.playSound(game.tommyVoice8);
                game.gameUI.messageText.setText("Tommy - \n\"Wait a minute...\"\n\n\"Why is the snacks so moldy and old...They look like they've been here for months\"");
                game.playerFamily.setTommyTalkCounter();
                break;
            case 7:
                game.gameUI.messageText.setText("Hey Tommy, I'm really sorry but I don't think your family lives here anymore...");
                game.playerFamily.setTommyTalkCounter();
                break;
            case 8:
                if (!game.playerFamily.getGraveExplored()) {
                    game.stopSound(game.tommyVoice8);
                    game.playSound(game.tommyVoice9);
                    game.gameUI.messageText.setText("Tommy - \n\"That can't be true...\"\n\n\"Please look around for them...\"");
                } else {
                    game.gameUI.messageText.setText("Tommy, I'm really sorry to tell you but I believe your parents past away...\n\nYou witness Tommy breakdown and try to comfort him...");
                    game.playerFamily.setTommyTalkCounter();
                }
                break;
            case 9:
                game.stopSound(game.tommyVoice9);
                game.playSound(game.tommyVoice10);
                game.gameUI.messageText.setText("Tommy - \n\"Can you take me to the flower field one last time...\"\n\n\"Hint: Check the photo album again!");

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

    public void grabKnife() {
        game.gameUI.messageText.setText("What are you gonna do with the knife???\n\nLet's put the knife back down...");
    }

    public void sharpenKnife() {
        game.gameUI.messageText.setText("Let's not sharpen the knife in front of a kid...\n\nYour choices are concerning me");
    }

    public void inspectBag() {
        game.gameUI.messageText.setText("You take a peek inside the bag...\n\nYou find some moldy apples and spoiled milk");
    }

    public void grabBag() {
        if (game.playerFamily.getTommyTalkCounter() >= 5) {
            game.gameUI.messageText.setText("I think this is what Tommy is talking about\n\nLet's bring it back to him");
            game.playerFamily.setGrabbedBag(true);
        } else {
            game.gameUI.messageText.setText("I wonder what this paper bag is doing here...\n\nYou can't grab the bag at the moment...Try talking to Tommy and come back again");
        }
    }

    public void exploreGrave() {
        if (game.playerFamily.getTommyTalkCounter() >= 8) {
            game.gameUI.messageText.setText("Could this be Tommy's family...\n\nHe's still so young...");
        }
    }

    public void inspectTombOne() {
        if (game.playerFamily.getTommyTalkCounter() >= 8) {
            game.gameUI.messageText.setText("Tommy's Mom");
            game.playerFamily.setGraveExplored(true);
        } else {
            game.gameUI.messageText.setText("I wonder who's grave this is...");
        }
    }

    public void inspectTombTwo() {
        if (game.playerFamily.getTommyTalkCounter() >= 8) {
            game.gameUI.messageText.setText("Tommy's Sister");
            game.playerFamily.setGraveExplored(true);
        } else {
            game.gameUI.messageText.setText("I wonder who's grave this is...");
        }
    }

    public void inspectTombThree() {
        if (game.playerFamily.getTommyTalkCounter() >= 8) {
            game.gameUI.messageText.setText("Tommy's Dad");
            game.playerFamily.setGraveExplored(true);
        } else {
            game.gameUI.messageText.setText("I wonder who's grave this is...");
        }
    }
    public void goFlowerField() {
        game.gameUI.messageText.setText("Tommy eventually finds a foster family, where he initially struggles to settle in. However, over time, he forms a deep bond with his new family...\n\nThank you for playing!");
    }

    //

}
