package org.markgravestock;

public class OpponentMove {

    private final Choice playerChoice;

    public OpponentMove(Choice playerChoice) {
        this.playerChoice = playerChoice;
    }

    public CompletedGame opponentChooses(Choice opponentChoice) {
        return new CompletedGame(opponentChoice, playerChoice);
    }
}
