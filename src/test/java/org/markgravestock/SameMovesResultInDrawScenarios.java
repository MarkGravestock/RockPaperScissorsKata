package org.markgravestock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SameMovesResultInDrawScenarios {
    private NewGame game;

    @Before
    public void beforeAll() {
        game = new NewGame();
    }

    @Test
    public void given_i_have_chosen_rock_when_the_opponent_chooses_rock_then_we_should_draw() {
        var completedGame = game.playerChooses(Choice.ROCK).opponentChooses(Choice.ROCK);
        assertTrue(completedGame.isOutcome(Outcome.DRAW));
    }

    @Test
    public void given_i_have_chosen_rock_when_the_opponent_chooses_rock_then_they_should_not_have_won() {
        var completedGame = game.playerChooses(Choice.ROCK).opponentChooses(Choice.ROCK);
        assertFalse(completedGame.isOutcome(Outcome.OPPONENT_WON));
    }

    @Test
    public void given_i_have_chosen_rock_when_the_opponent_chooses_rock_then_i_should_not_have_won() {
        var completedGame = game.playerChooses(Choice.ROCK).opponentChooses(Choice.ROCK);
        assertFalse(completedGame.isOutcome(Outcome.PLAYER_WON));
    }
}
