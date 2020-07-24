package org.markgravestock;

public class CompletedGame {
    private final Choice opponentChoice;
    private final Choice playerChoice;

    public CompletedGame(Choice opponentChoice, Choice playerChoice) {

        this.opponentChoice = opponentChoice;
        this.playerChoice = playerChoice;
    }

    public boolean isOutcome(Outcome outcome) {

        return switch(outcome) {
            case DRAW -> opponentChoice.equals(Choice.ROCK) && playerChoice.equals(Choice.ROCK);
            case PLAYER_WON -> !isOutcome(Outcome.DRAW) && !isOutcome(Outcome.OPPONENT_WON);
            case OPPONENT_WON -> !isOutcome(Outcome.DRAW) && opponentChoice.equals(Choice.ROCK) && !playerChoice.equals(Choice.PAPER) || opponentChoice.equals(Choice.PAPER) && playerChoice.equals(Choice.ROCK) || opponentChoice.equals(Choice.SCISSORS) && playerChoice.equals(Choice.PAPER);
        };
    }
}
