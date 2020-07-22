package org.markgravestock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RockBeatsScissorsScenarios {

    private Game game;

    @Before
    public void beforeAll() {
        game = new Game();
    }

    @Test
    public void given_i_have_chosen_rock_when_the_opponent_chooses_scissors_then_i_should_win() {
        var completedGame = game.playerChoosesRock().opponentChoosesScissors();
        assertTrue(completedGame.hasPlayerWon());
    }

    @Test
    public void given_i_have_chosen_rock_when_the_opponent_chooses_scissors_then_they_should_not_win() {
        var completedGame = game.playerChoosesRock().opponentChoosesScissors();
        assertFalse(completedGame.hasOpponentWon());
    }

    @Test
    public void given_i_have_chosen_scissors_when_the_opponent_chooses_rock_then_they_should_win() {
        var completedGame = game.playerChoosesScissors().opponentChoosesRock();
        assertTrue(completedGame.hasOpponentWon());
    }
}
