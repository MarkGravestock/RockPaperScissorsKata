package org.markgravestock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameMovesResultInDrawScenarios {
    private NewGame game;

    @Before
    public void beforeAll() {
        game = new NewGame();
    }

    @Test
    public void given_i_have_chosen_rock_when_the_opponent_chooses_rock_then_we_should_draw_1() {
        var completedGame = game.playerChooses(Choice.ROCK).opponentChooses(Choice.ROCK);
        assertEquals(completedGame.determineOutcome(), Outcome.DRAW);
    }

    @Test
    public void given_i_have_chosen_rock_when_the_opponent_chooses_rock_then_they_should_not_have_won() {
        var completedGame = game.playerChooses(Choice.ROCK).opponentChooses(Choice.ROCK);
        assertNotEquals(completedGame.determineOutcome(), Outcome.OPPONENT_WON);
    }

    @Test
    public void given_i_have_chosen_rock_when_the_opponent_chooses_rock_then_i_should_not_have_won() {
        var completedGame = game.playerChooses(Choice.ROCK).opponentChooses(Choice.ROCK);
        assertNotEquals(completedGame.determineOutcome(), Outcome.PLAYER_WON);
    }

    @Test
    public void given_i_have_chosen_paper_when_the_opponent_chooses_paper_then_we_should_draw_2() {
        var completedGame = game.playerChooses(Choice.PAPER).opponentChooses(Choice.PAPER);
        assertEquals(completedGame.determineOutcome(), Outcome.DRAW);
    }

    @Test
    public void given_i_have_chosen_scissors_when_the_opponent_chooses_scissors_then_we_should_draw_3() {
        var completedGame = game.playerChooses(Choice.SCISSORS).opponentChooses(Choice.SCISSORS);
        assertEquals(completedGame.determineOutcome(), Outcome.DRAW);
    }
}
