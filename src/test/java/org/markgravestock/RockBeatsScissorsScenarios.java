package org.markgravestock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RockBeatsScissorsScenarios {

    private NewGame game;

    @Before
    public void beforeAll() {
        game = new NewGame();
    }

    @Test
    public void given_i_have_chosen_rock_when_the_opponent_chooses_scissors_then_i_should_win() {
        var completedGame = game.playerChooses(Choice.ROCK).opponentChooses(Choice.SCISSORS);
        assertTrue(completedGame.hasPlayerWon());
    }

    @Test
    public void given_i_have_chosen_rock_when_the_opponent_chooses_scissors_then_they_should_not_win() {
        var completedGame = game.playerChooses(Choice.ROCK).opponentChooses(Choice.SCISSORS);
        assertFalse(completedGame.hasOpponentWon());
    }

    @Test
    public void given_i_have_chosen_scissors_when_the_opponent_chooses_rock_then_they_should_win() {
        var completedGame = game.playerChooses(Choice.SCISSORS).opponentChooses(Choice.ROCK);
        assertTrue(completedGame.hasOpponentWon());
    }

    @Test
    public void given_i_have_chosen_scissors_when_the_opponent_chooses_rock_then_i_should_not_win() {
        var completedGame = game.playerChooses(Choice.SCISSORS).opponentChooses(Choice.ROCK);
        assertFalse(completedGame.hasPlayerWon());
    }
}
