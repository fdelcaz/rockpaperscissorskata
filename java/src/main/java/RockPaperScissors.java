public class RockPaperScissors {
  public GameStatus move(Move playerOneMovement, Move playerTwoMovement) {

    switch (playerOneMovement) {
      case ROCK:
        return playerTwoMovement.equals(Move.SCISSORS) ? GameStatus.PLAYER_ONE_WON : GameStatus.PLAYER_TWO_WON;
      case PAPER:
        return playerTwoMovement.equals(Move.ROCK) ? GameStatus.PLAYER_ONE_WON : GameStatus.PLAYER_TWO_WON;
      case SCISSORS:
        return playerTwoMovement.equals(Move.PAPER) ? GameStatus.PLAYER_ONE_WON : GameStatus.PLAYER_TWO_WON;
      default:
        return GameStatus.PLAYER_ONE_WON;
    }
  }
}
