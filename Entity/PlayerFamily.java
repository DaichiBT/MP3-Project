package Entity;

import main.MainGame;

public class PlayerFamily extends Player {
    private boolean checkedPhotoAlbum;
    private int tommyTalkCounter;
    private boolean knifeLifted;

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

}
