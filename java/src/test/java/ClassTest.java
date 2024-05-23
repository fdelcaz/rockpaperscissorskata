import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassTest {

  @ParameterizedTest
  @CsvSource({
    "ROCK, SCISSORS, PLAYER_ONE_WON",
    "SCISSORS, ROCK, PLAYER_TWO_WON",
    "PAPER, ROCK, PLAYER_ONE_WON",
    "ROCK, PAPER, PLAYER_TWO_WON",
    "SCISSORS, PAPER, PLAYER_ONE_WON",
    "PAPER, SCISSORS, PLAYER_TWO_WON",
    "ROCK, ROCK, DRAW",
    "PAPER, PAPER, DRAW",
    "SCISSORS, SCISSORS, DRAW"
  })
  void testRockPaperScissors(Move playerOneMovement, Move playerTwoMovement, GameStatus expectedGameStatus) {
    RockPaperScissors rockPaperScissors = new RockPaperScissors();
    GameStatus gameStatus = rockPaperScissors.move(playerOneMovement, playerTwoMovement);

    assertEquals(expectedGameStatus, gameStatus);
  }
}
