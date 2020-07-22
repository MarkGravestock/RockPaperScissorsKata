package org.markgravestock;

public class CompletedGame {
    private Choice opponentChoice;

    public CompletedGame(Choice opponentChoice) {

        this.opponentChoice = opponentChoice;
    }

    public boolean hasPlayerWon() {
        return true;
    }

    public boolean hasOpponentWon() {
        return opponentChoice.equals(Choice.ROCK);
    }
}
