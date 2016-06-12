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
public class ConsulView implements View {

	/* (non-Javadoc)
	 * @see ui.View#getFirstPlayer()
	 */
	@Override
	public boolean getFirstPlayer() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see ui.View#getHumanMove(board.GameBoard)
	 */
	@Override
	public Move getHumanMove(GameBoard board) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameType getGameType() {
		// TODO Auto-generated method stub
		return null;
	}

}
