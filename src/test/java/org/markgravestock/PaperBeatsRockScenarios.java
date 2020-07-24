package org.markgravestock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PaperBeatsRockScenarios {
    private NewGame game;

    @Before
    public void beforeAll() {
        game = new NewGame();
    }

    @Test
    public void given_i_have_chosen_paper_when_the_opponent_chooses_rock_then_i_should_win() {
        var completedGame = game.playerChooses(Choice.PAPER).opponentChooses(Choice.ROCK);
        assertTrue(completedGame.isOutcome(Outcome.PLAYER_WON));
    }

    @Test
    public void given_i_have_chosen_rock_when_the_opponent_chooses_paper_then_they_should_win() {
        var completedGame = game.playerChooses(Choice.ROCK).opponentChooses(Choice.PAPER);
        assertTrue(completedGame.isOutcome(Outcome.OPPONENT_WON));
    }
}
