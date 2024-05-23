public class RockPaperScissors {
  public GameStatus move(Move playerOneMovement, Move playerTwoMovement) {

    if (playerOneMovement.equals(playerTwoMovement))
      return GameStatus.DRAW;

    return switch (playerOneMovement) {
      case ROCK -> playerTwoMovement.equals(Move.SCISSORS) ? GameStatus.PLAYER_ONE_WON : GameStatus.PLAYER_TWO_WON;
      case PAPER -> playerTwoMovement.equals(Move.ROCK) ? GameStatus.PLAYER_ONE_WON : GameStatus.PLAYER_TWO_WON;
      case SCISSORS -> playerTwoMovement.equals(Move.PAPER) ? GameStatus.PLAYER_ONE_WON : GameStatus.PLAYER_TWO_WON;
    };

  }
}
