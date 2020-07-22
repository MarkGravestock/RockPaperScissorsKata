package org.markgravestock;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class RockBeatsScissorsScenarios {

    @Test
    public void given_no_plays_have_been_made_then_no_one_has_won() {
        var game = new Game();
        assertFalse(game.hasPlayerWon());
    }

    @Test
    public void given_i_have_chosen_rock_when_the_opponent_chooses_scissors_then_i_should_win() {
        var game = new Game();
        game.playerChoosesRock();
        game.opponentChoosesScissors();
        assertTrue(game.hasPlayerWon());
    }
}
