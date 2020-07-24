package org.markgravestock;

public class CompletedGame {
    private final Choice opponentChoice;
    private final Choice playerChoice;

    public CompletedGame(Choice opponentChoice, Choice playerChoice) {

        this.opponentChoice = opponentChoice;
        this.playerChoice = playerChoice;
    }

    public Outcome determineOutcome() {
        if (isDraw(opponentChoice, playerChoice)) {
            return Outcome.DRAW;
        }

        if (hasOpponentWon(opponentChoice, playerChoice)) {
            return Outcome.OPPONENT_WON;
        }

        return Outcome.PLAYER_WON;
    }

    private boolean hasOpponentWon(Choice opponentChoice, Choice playerChoice) {
        return opponentChoice.equals(Choice.ROCK) && !playerChoice.equals(Choice.PAPER) || opponentChoice.equals(Choice.PAPER) && playerChoice.equals(Choice.ROCK) || opponentChoice.equals(Choice.SCISSORS) && playerChoice.equals(Choice.PAPER);
    }

    private boolean isDraw(Choice opponentChoice, Choice playerChoice) {
        return opponentChoice.equals(playerChoice);
    }
}
