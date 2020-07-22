### Rock Paper Scissors Kata - Java

Using instructions from https://agilekatas.co.uk/katas/RockPaperScissors-Kata

#### Notes

- When no-one has played is it even a valid question to ask who has won? Should the API allow this?
- Are players choosing really seperate calls. Normally they both show their move together.

- Does having 2 won methods make API harder to use. How about completedGame.winner().equals(Competitor.PLAYER) or completedGame.isWinner(Competitor.PLAYER) ?