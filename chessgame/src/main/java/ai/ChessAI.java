package ai;

import board.GameBoard;
import board.Move;

/**
 * @author ammar_samater
 *
 */
public class ChessAI implements AI {

	private boolean blackColor;
	private GameBoard board;

	public ChessAI(boolean turn) {
		blackColor = turn;			// if human plays first, AI gets the black pieces 
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBoard(GameBoard copy) {
		board = copy;
	}

	@Override
	public Move getAIMove(Move humanMove) {
		// if human move is null, then AI makes its first move
		// TODO Auto-generated method stub
		return null;
	}

}
