package Entity;

import main.MainGame;

public class PlayerFamily extends Player {
    private boolean checkedPhotoAlbum;
    private int tommyTalkCounter;
    private boolean knifeLifted;
    private boolean grabbedBag;
    private boolean graveExplored;



    public PlayerFamily(MainGame game) {
        super(game);
    }

    public void setCheckedPhotoAlbum(boolean b) {
        checkedPhotoAlbum = b;
    }

    public boolean getCheckedPhotoAlbum() {
        return checkedPhotoAlbum;
    }

    public void setTommyTalkCounter() {
        tommyTalkCounter++;

    }

    public int getTommyTalkCounter() {
        return tommyTalkCounter;
    }
    public void setKnifeLifted(boolean b) {
        knifeLifted = b;
    }
    public boolean getKnifeLifted() {
        return knifeLifted;
    }

    public void setGrabbedBag(boolean b) {
        grabbedBag = b;

    }

    public boolean getGrabbedBag() {
        return grabbedBag;
    }

    public void setGraveExplored(boolean b) {
        graveExplored = b;
    }

    public boolean getGraveExplored() {
        return graveExplored;
    }

    public void resetVars() {
        tommyTalkCounter = 0;
        checkedPhotoAlbum = false;
        knifeLifted = false;
        grabbedBag = false;
        graveExplored = false;
    }
}
