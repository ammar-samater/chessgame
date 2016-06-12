/**
 * 
 */
package board;

/**
 * @author ammar_000
 *
 */
public interface GameBoard {

	boolean isGameOver();

	void makeMove(Move move);

	GameBoard getCopy();

}
