import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClassTest {

  @Test
  public void player_one_with_rock_should_beat_scissors() {
    GameStatus expectedGameStatus = GameStatus.PLAYER_ONE_WON;

    Move playerOneMovement = Move.ROCK;
    Move playerTwoMovement = Move.SCISSORS;

    RockPaperScissors rockPaperScissors = new RockPaperScissors();
    GameStatus gameStatus = rockPaperScissors.move(playerOneMovement, playerTwoMovement);

    assertEquals(gameStatus, expectedGameStatus);
  }

  @Test
  public void player_two_with_rock_should_beat_scissors(){
    GameStatus expectedGameStatus = GameStatus.PLAYER_TWO_WON;

    Move playerOneMovement = Move.SCISSORS;
    Move playerTwoMovement = Move.ROCK;

    RockPaperScissors rockPaperScissors = new RockPaperScissors();
    GameStatus gameStatus = rockPaperScissors.move(playerOneMovement, playerTwoMovement);

    assertEquals(gameStatus, expectedGameStatus);
  }

  @Test
  public void player_one_with_paper_should_beat_rock() {
    GameStatus expectedGameStatus = GameStatus.PLAYER_ONE_WON;

    Move playerOneMovement = Move.PAPER;
    Move playerTwoMovement = Move.ROCK;

    RockPaperScissors rockPaperScissors = new RockPaperScissors();
    GameStatus gameStatus = rockPaperScissors.move(playerOneMovement, playerTwoMovement);

    assertEquals(gameStatus, expectedGameStatus);
  }

  @Test
  public void player_two_with_paper_should_beat_rock() {
    GameStatus expectedGameStatus = GameStatus.PLAYER_TWO_WON;

    Move playerOneMovement = Move.ROCK;
    Move playerTwoMovement = Move.PAPER;

    RockPaperScissors rockPaperScissors = new RockPaperScissors();
    GameStatus gameStatus = rockPaperScissors.move(playerOneMovement, playerTwoMovement);

    assertEquals(gameStatus, expectedGameStatus);
  }

  @Test
  public void player_one_with_scissors_should_beat_paper() {
    GameStatus expectedGameStatus = GameStatus.PLAYER_ONE_WON;

    Move playerOneMovement = Move.SCISSORS;
    Move playerTwoMovement = Move.PAPER;

    RockPaperScissors rockPaperScissors = new RockPaperScissors();
    GameStatus gameStatus = rockPaperScissors.move(playerOneMovement, playerTwoMovement);

    assertEquals(gameStatus, expectedGameStatus);
  }

  @Test
  public void player_two_with_scissors_should_beat_paper() {
    GameStatus expectedGameStatus = GameStatus.PLAYER_TWO_WON;

    Move playerOneMovement = Move.PAPER;
    Move playerTwoMovement = Move.SCISSORS;

    RockPaperScissors rockPaperScissors = new RockPaperScissors();
    GameStatus gameStatus = rockPaperScissors.move(playerOneMovement, playerTwoMovement);

    assertEquals(gameStatus, expectedGameStatus);
  }

}
