package org.markgravestock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaperBeatsRockScenarios {
    private NewGame game;

    @Before
    public void beforeAll() {
        game = new NewGame();
    }

    @Test
    public void given_i_have_chosen_paper_when_the_opponent_chooses_rock_then_i_should_win_6() {
        var completedGame = game.playerChooses(Choice.PAPER).opponentChooses(Choice.ROCK);
        assertEquals(completedGame.determineOutcome(), Outcome.PLAYER_WON);
    }

    @Test
    public void given_i_have_chosen_rock_when_the_opponent_chooses_paper_then_they_should_win_7() {
        var completedGame = game.playerChooses(Choice.ROCK).opponentChooses(Choice.PAPER);
        assertEquals(completedGame.determineOutcome(), Outcome.OPPONENT_WON);
    }
}
