package org.markgravestock;

public class OpponentMove {
    public CompletedGame opponentChoosesScissors() {
        return new CompletedGame(Choice.SCISSORS);
    }

    public CompletedGame opponentChoosesRock() {
        return new CompletedGame(Choice.ROCK);
    }
}
