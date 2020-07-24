package org.markgravestock;

public class CompletedGame {
    private final Choice opponentChoice;
    private final Choice playerChoice;

    public CompletedGame(Choice opponentChoice, Choice playerChoice) {

        this.opponentChoice = opponentChoice;
        this.playerChoice = playerChoice;
    }

    public boolean isOutcome(Outcome outcome) {
        return determineOutcome().equals(outcome);
    }

    private Outcome determineOutcome() {
        if (opponentChoice.equals(playerChoice)) {
            return Outcome.DRAW;
        }

        if (opponentChoice.equals(Choice.ROCK) && !playerChoice.equals(Choice.PAPER) || opponentChoice.equals(Choice.PAPER) && playerChoice.equals(Choice.ROCK) || opponentChoice.equals(Choice.SCISSORS) && playerChoice.equals(Choice.PAPER)) {
            return Outcome.OPPONENT_WON;
        }

        return Outcome.PLAYER_WON;
    }
}
