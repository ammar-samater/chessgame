/**
 * 
 */
package ai;

import board.GameBoard;
import board.Move;

/**
 * @author ammar_samater
 *
 */
public interface AI extends Runnable{

	Move getAIMove(Move humanMove);

	void setBoard(GameBoard copy);

}
