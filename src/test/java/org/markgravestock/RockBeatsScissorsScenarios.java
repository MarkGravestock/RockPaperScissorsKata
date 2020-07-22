package org.markgravestock;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RockBeatsScissorsScenarios {

    @Test
    public void given_i_have_chosen_rock_when_the_opponent_chooses_scissors_then_i_should_win() {
        var game = new Game();
        var completedGame = game.playerChoosesRock().opponentChoosesScissors();
        assertTrue(completedGame.hasPlayerWon());
    }
}
