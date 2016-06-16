/**
 * 
 */
package ui;

import board.GameType;
import board.Move;

/**
 * @author ammar_samater
 *
 */
public interface View {

	/**
	 * 
	 * @return
	 */
	boolean getFirstPlayer();

	/**
	 * 
	 * @return
	 */
	Move getHumanMove();

	/**
	 * 
	 * @return
	 */
	GameType getGameType();

}
