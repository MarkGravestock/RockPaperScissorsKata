package org.markgravestock;

public class OpponentMove {

    private final Choice playerChoice;

    public OpponentMove(Choice playerChoice) {
        this.playerChoice = playerChoice;
    }

    public CompletedGame opponentChoosesScissors() {
        return new CompletedGame(Choice.SCISSORS, playerChoice);
    }

    public CompletedGame opponentChoosesRock() {
        return new CompletedGame(Choice.ROCK, playerChoice);
    }

    public CompletedGame opponentChoosesPaper() { return new CompletedGame(Choice.PAPER, playerChoice);
    }
}
