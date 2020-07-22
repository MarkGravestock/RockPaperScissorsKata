package org.markgravestock;

public class Game {

    private boolean hasPlayerWon = false;

    public boolean hasPlayerWon() {
        return hasPlayerWon;
    }

    public void playerChoosesRock() {
        hasPlayerWon = true;
    }

    public void opponentChoosesScissors() {

    }
}
