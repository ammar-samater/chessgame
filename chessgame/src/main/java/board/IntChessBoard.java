package board;

import java.util.Arrays;

import board.ChessPiece;
import board.GameBoard;
import board.Move;

/**
 * @author ammar_samater
 *
 */
public class IntChessBoard implements GameBoard {
	
	private int[][] board;
	private int[] blackKingLocation;
	private int[] whiteKingLocation;
	
	

	/**
	 * 
	 */
	public IntChessBoard() {
		board = new int[8][8];
		for (int i = 0; i < 8; i++){
			board[1][i] = ChessPiece.BLACK_PAWN.getValue();
			board[6][i] = ChessPiece.WHITE_PAWN.getValue();
		}

		board[0][0] = ChessPiece.BLACK_ROOK.getValue();
		board[0][7] = ChessPiece.BLACK_ROOK.getValue();

		board[0][1] = ChessPiece.BLACK_KNIGHT.getValue();
		board[0][6] = ChessPiece.BLACK_KNIGHT.getValue();

		board[0][2] = ChessPiece.BLACK_BISHOP.getValue();
		board[0][5] = ChessPiece.BLACK_BISHOP.getValue();

		board[0][3] = ChessPiece.BLACK_QUEEN.getValue();
		board[0][4] = ChessPiece.BLACK_KING.getValue();
		blackKingLocation = new int[2];
		blackKingLocation[0] = 0;
		blackKingLocation[1] = 4;
	
		board[7][0] = ChessPiece.WHITE_ROOK.getValue();
		board[7][7] = ChessPiece.WHITE_ROOK.getValue();

		board[7][1] = ChessPiece.WHITE_KNIGHT.getValue();
		board[7][6] = ChessPiece.WHITE_KNIGHT.getValue();

		board[7][2] = ChessPiece.WHITE_BISHOP.getValue();
		board[7][5] = ChessPiece.WHITE_BISHOP.getValue();

		board[7][3] = ChessPiece.WHITE_QUEEN.getValue();
		board[7][4] = ChessPiece.WHITE_KING.getValue();
		whiteKingLocation = new int[2];
		whiteKingLocation[0] = 7;
		whiteKingLocation[1] = 4;
		
	}
	
	

	/**
	 * @param board
	 */
	public IntChessBoard(int[][] board) {
		this.board = board;
		blackKingLocation = new int[2];
		whiteKingLocation = new int[2];
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				if (board[i][j] == ChessPiece.BLACK_KING.getValue()){
					blackKingLocation[0] = i;
					blackKingLocation[1] = j;
				}
				if (board[i][j] == ChessPiece.WHITE_KING.getValue()){
					whiteKingLocation[0] = i;
					whiteKingLocation[1] = j;
				}
			}
		}
	}



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
		return new IntChessBoard(cloneArray(board));
	}

	private int[][] cloneArray(int[][] board){
		    int length = board.length;
		    int[][] newBoard = new int[length][board[0].length];
		    for (int i = 0; i < length; i++) {
		        System.arraycopy(board[i], 0, newBoard[i], 0, board[i].length);
		    }
		    return newBoard;
	}



	@Override
	public boolean moveIsLegal(Move move) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moveIsValid(Move move) {
		// TODO Auto-generated method stub
		return false;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(" ----------------------------------------------------------------------------------------------------------------\n");
		for(int i = 0; i < board.length; i++){
			string.append("| ");
			for (int j = 0; j < board[i].length; j++){
				if(board[i][j] != 0){
					string.append(ChessPiece.getChessPiece(board[i][j]));
					for(int k = 0; k<(13-ChessPiece.getChessPiece(board[i][j]).toString().length()); k++){
						string.append('\0');
					}
					string.append("|");
				}
				else{
					string.append("             |");
				}
			}
			string.append("\n");
			string.append(" ----------------------------------------------------------------------------------------------------------------\n");
		}
		return string.toString();	
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(blackKingLocation);
		result = prime * result + Arrays.deepHashCode(board);
		result = prime * result + Arrays.hashCode(whiteKingLocation);
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntChessBoard other = (IntChessBoard) obj;
		if (!Arrays.equals(blackKingLocation, other.blackKingLocation))
			return false;
		if (!Arrays.deepEquals(board, other.board))
			return false;
		if (!Arrays.equals(whiteKingLocation, other.whiteKingLocation))
			return false;
		return true;
	}
	
}