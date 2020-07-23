package org.markgravestock;

public class NewGame {

    public OpponentMove playerChoosesRock() {
        return new OpponentMove(Choice.ROCK);
    }

    public OpponentMove playerChoosesScissors() {
        return new OpponentMove(Choice.SCISSORS);
    }

    public OpponentMove playerChoosesPaper() {
        return new OpponentMove(Choice.PAPER);
    }
}
