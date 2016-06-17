/**
 * 
 */
package board;

/**
 * @author ammar_000
 *
 */
public interface GameBoard {

	/**
	 * Checks if the game has ended. A game may end if one 
	 * of the players have won or if the game is a draw.
	 * @return true if the game has ended.
	 */
	boolean isGameOver();

	/**
	 * Updates the state of this game board to what it should be after 
	 * the received move is made.
	 * @param move the move that will be performed.
	 */
	void makeMove(Move move);

	/**
	 * Creates a Copy of this game board.
	 * @return the created copy of this game board.
	 */
	GameBoard getCopy();

	boolean moveIsLegal(Move move);

	boolean moveIsValid(Move move);

}
