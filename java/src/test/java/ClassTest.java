import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClassTest {

  @Test
  public void rock_should_beat_scissors() {
    GameStatus expectedGameStatus = GameStatus.PLAYER_ONE_WON;
    Move playerOneMovement = new Move(Movement.ROCK);
    Move playerTwoMovement = new Move(Movement.SCISSORS);
    RockPaperScissors rockPaperScissors = new RockPaperScissors();
    GameStatus gameStatus = rockPaperScissors.move(playerOneMovement, playerTwoMovement);

    assertEquals(gameStatus, expectedGameStatus);
  }
}
