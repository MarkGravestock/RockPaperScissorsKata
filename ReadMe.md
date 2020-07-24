### Rock Paper Scissors Kata - Java

Using instructions from https://agilekatas.co.uk/katas/RockPaperScissors-Kata

#### Aim/Intention

- Practice Java/refamiliarise with Java development process

#### Notes

- When no-one has played is it even a valid question to ask who has won? Should the API allow this?
- Are players choosing really separate calls. Normally they both show their move together.

- Does having 2 won methods make API harder to use. How about completedGame.winner().equals(Competitor.PLAYER) or completedGame.isWinner(Competitor.PLAYER) ?

- Note the weird user story and contrived SO THAT.

- I need to consider applying TPP principles to my API (https://8thlight.com/blog/micah-martin/2012/11/17/transformation-priority-premise-applied.html)
    - Constant -> Scalar e.g. playerChoosesRock() -> playerChooses(Choice.ROCK). Which is suggested by the refactor to remove duplication (algorithmic)
    - Also refactors there can be an opposite e.g. introduce variable <-> inline
    
- OK so final check

| Player Move | Opponent ROCK | Opponent PAPER | Opponent SCISSORS |
| --- | --- | --- | --- |
| ROCK | Draw (1) | Opponent Win (7) | Player Win (4) |
| PAPER | Player Win (6) | Draw (2) | Opponent Win (9) |
| SCISSORS | Opponent Win (5) | Player Win (8) | Draw (3) |

9 Outcomes.

Trying a 'devils advocate strategy on the implementation'.