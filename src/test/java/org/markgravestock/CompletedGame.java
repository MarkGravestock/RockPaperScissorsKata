package org.markgravestock;

public class CompletedGame {
    private final Choice opponentChoice;
    private final Choice playerChoice;

    public CompletedGame(Choice opponentChoice, Choice playerChoice) {

        this.opponentChoice = opponentChoice;
        this.playerChoice = playerChoice;
    }

    public boolean hasPlayerWon() {
        return !hasOpponentWon();
    }

    public boolean hasOpponentWon() {
        return opponentChoice.equals(Choice.ROCK) && !playerChoice.equals(Choice.PAPER) || opponentChoice.equals(Choice.PAPER) && playerChoice.equals(Choice.ROCK) || opponentChoice.equals(Choice.SCISSORS) && playerChoice.equals(Choice.PAPER);
    }
}
