/**
 * 
 */
package ui;

import board.GameBoard;
import board.GameType;
import board.Move;

/**
 * @author ammar_samater
 *
 */
public interface View {

	boolean getFirstPlayer();

	Move getHumanMove(GameBoard board);

	GameType getGameType();

}
