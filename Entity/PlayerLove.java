package Entity;

import main.MainGame;

public class PlayerLove extends Player {
    private int lovePoints;

    public PlayerLove(MainGame game) {
        super(game);
    }

    public void setLovePoints(int i) {
        lovePoints += i;
    }
    public int getLovePoints() {
        return lovePoints;
    }
    public void resetVars() {
        lovePoints = 0;
    }
}
