/**
 * 
 */
package ui;

import board.ChessMove;
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
	public Move getHumanMove() {
		boolean flag = true;
		boolean inRange;
		int x;
		Move move = new ChessMove();
		do{
			/*inRange = true;
			System.out.println("input move in form of (row coloumn row column). ie. left top corner to bottom right corner is (0 0 7 7)");
			for ( int i = 0; i < 4; i++){
				x = s.nextInt();
				if ( x >= 0 && x <= 7)
					move[i] = x;
				else {
					inRange = false;
					break;
				}
			}
			// check if player moving his own piece, and is not moving into a position occupied by his own piece
			if (inRange && (board[move[0]][move[1]] < 0 && pColor < 0 && board[move[2]][move[3]] >= 0) || (board[move[0]][move[1]] > 0 && pColor > 0  && board[move[2]][move[3]] <= 0)){     
				if (isMoveCorrect(move, board) == true)
					flag = false;
			}*/
		}while(flag);

		return move;
	}

	@Override
	public GameType getGameType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayErrorMessage(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void announceWinner(String string) {
		// TODO Auto-generated method stub
		
	}

}
