/**
 * 
 */
package board;

/**
 * @author ammar_samater
 *
 */
public class ChessBoard implements GameBoard {
	
	private ChessPiece[][] board;

	/* (non-Javadoc)
	 * @see board.GameBoard#isGameOver()
	 */
	@Override
	public boolean isGameOver() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see board.GameBoard#makeMove(board.Move)
	 */
	@Override
	public void makeMove(Move move) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see board.GameBoard#getCopy()
	 */
	@Override
	public GameBoard getCopy() {
		// TODO Auto-generated method stub
		return null;
	}

}
