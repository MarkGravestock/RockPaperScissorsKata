package org.markgravestock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ScissorsBeatsPaperScenarios {

    private NewGame game;

    @Before
    public void beforeAll() {
        game = new NewGame();
    }

    @Test
    public void given_i_have_chosen_scissors_when_the_opponent_chooses_paper_then_i_should_win() {
        var completedGame = game.playerChooses(Choice.SCISSORS).opponentChooses(Choice.PAPER);
        assertTrue(completedGame.hasPlayerWon());
    }

    @Test
    public void given_i_have_chosen_paper_when_the_opponent_chooses_scissors_then_they_should_win() {
        var completedGame = game.playerChooses(Choice.PAPER).opponentChooses(Choice.SCISSORS);
        assertTrue(completedGame.hasOpponentWon());
    }
}
