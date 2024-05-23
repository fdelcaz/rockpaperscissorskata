import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassTest {

  public static Stream<Arguments> provideMovesAndExpectedResults() {
    return Stream.of(
      Arguments.of(Move.ROCK, Move.SCISSORS, GameStatus.PLAYER_ONE_WON),
      Arguments.of(Move.SCISSORS, Move.ROCK, GameStatus.PLAYER_TWO_WON),
      Arguments.of(Move.PAPER, Move.ROCK, GameStatus.PLAYER_ONE_WON),
      Arguments.of(Move.ROCK, Move.PAPER, GameStatus.PLAYER_TWO_WON),
      Arguments.of(Move.SCISSORS, Move.PAPER, GameStatus.PLAYER_ONE_WON),
      Arguments.of(Move.PAPER, Move.SCISSORS, GameStatus.PLAYER_TWO_WON),
      Arguments.of(Move.ROCK, Move.ROCK, GameStatus.DRAW),
      Arguments.of(Move.PAPER, Move.PAPER, GameStatus.DRAW),
      Arguments.of(Move.SCISSORS, Move.SCISSORS, GameStatus.DRAW)
    );
  }

  @ParameterizedTest
  @MethodSource("provideMovesAndExpectedResults")
  void testRockPaperScissors(Move playerOneMovement, Move playerTwoMovement, GameStatus expectedGameStatus) {
    RockPaperScissors rockPaperScissors = new RockPaperScissors();
    GameStatus gameStatus = rockPaperScissors.move(playerOneMovement, playerTwoMovement);

    assertEquals(expectedGameStatus, gameStatus);
  }
}
