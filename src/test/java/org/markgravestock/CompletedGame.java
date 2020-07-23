package org.markgravestock;

public class CompletedGame {
    private Choice opponentChoice;

    public CompletedGame(Choice opponentChoice) {

        this.opponentChoice = opponentChoice;
    }

    public boolean hasPlayerWon() {
        return !hasOpponentWon();
    }

    public boolean hasOpponentWon() {
        return opponentChoice.equals(Choice.ROCK);
    }
}
