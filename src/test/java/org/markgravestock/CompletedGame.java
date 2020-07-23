package org.markgravestock;

public class CompletedGame {
    private final Choice opponentChoice;
    private final Choice playerChoice;

    public CompletedGame(Choice opponentChoice, Choice playerChoice) {

        this.opponentChoice = opponentChoice;
        this.playerChoice = playerChoice;
    }

    private boolean isOutcome(Outcome outcome) {

        return switch(outcome) {
            case PLAYER_WON -> !isDraw() && !hasOpponentWon();
            case OPPONENT_WON -> !isDraw() && opponentChoice.equals(Choice.ROCK) && !playerChoice.equals(Choice.PAPER) || opponentChoice.equals(Choice.PAPER) && playerChoice.equals(Choice.ROCK) || opponentChoice.equals(Choice.SCISSORS) && playerChoice.equals(Choice.PAPER);
            case DRAW -> opponentChoice.equals(Choice.ROCK) && playerChoice.equals(Choice.ROCK);
        };
    }

    public boolean hasPlayerWon() {
        return isOutcome(Outcome.PLAYER_WON);
    }

    public boolean hasOpponentWon() {
        return isOutcome(Outcome.OPPONENT_WON);
    }

    public boolean isDraw() {
        return isOutcome(Outcome.DRAW);
    }
}
