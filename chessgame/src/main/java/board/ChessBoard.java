/**
 * 
 */
package board;

import java.util.Arrays;

import boardTests.ChessPieceTest;

/**
 * @author ammar_samater
 *
 */
public class ChessBoard implements GameBoard {
	
	private ChessPiece[][] board;
	private int[] blackKingLocation;
	private int[] whiteKingLocation;
	
	

	/**
	 * 
	 */
	public ChessBoard() {
		board = new ChessPiece[8][8];
		for (int i = 0; i < 8; i++){
			board[1][i] = ChessPiece.BLACK_PAWN;
			board[6][i] = ChessPiece.WHITE_PAWN;
		}

		board[0][0] = ChessPiece.BLACK_ROOK;
		board[0][7] = ChessPiece.BLACK_ROOK;

		board[0][1] = ChessPiece.BLACK_KNIGHT;
		board[0][6] = ChessPiece.BLACK_KNIGHT;

		board[0][2] = ChessPiece.BLACK_BISHOP;
		board[0][5] = ChessPiece.BLACK_BISHOP;

		board[0][3] = ChessPiece.BLACK_QUEEN;
		board[0][4] = ChessPiece.BLACK_KING;
		blackKingLocation = new int[2];
		blackKingLocation[0] = 0;
		blackKingLocation[1] = 4;
	
		board[7][0] = ChessPiece.WHITE_ROOK;
		board[7][7] = ChessPiece.WHITE_ROOK;

		board[7][1] = ChessPiece.WHITE_KNIGHT;
		board[7][6] = ChessPiece.WHITE_KNIGHT;

		board[7][2] = ChessPiece.WHITE_BISHOP;
		board[7][5] = ChessPiece.WHITE_BISHOP;

		board[7][3] = ChessPiece.WHITE_QUEEN;
		board[7][4] = ChessPiece.WHITE_KING;
		whiteKingLocation = new int[2];
		whiteKingLocation[0] = 7;
		whiteKingLocation[1] = 4;
		
	}
	
	

	/**
	 * @param board
	 */
	public ChessBoard(ChessPiece[][] board) {
		this.board = board;
		blackKingLocation = new int[2];
		whiteKingLocation = new int[2];
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				if (board[i][j] != null && board[i][j].equals(ChessPiece.BLACK_KING)){
					blackKingLocation[0] = i;
					blackKingLocation[1] = j;
				}
				if ( board[i][j] != null && board[i][j].equals(ChessPiece.WHITE_KING)){
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
		return new ChessBoard(cloneArray(board));
	}

	private ChessPiece[][] cloneArray(ChessPiece[][] board){
		    int length = board.length;
		    ChessPiece[][] newBoard = new ChessPiece[length][board[0].length];
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
				if(board[i][j] != null){
					string.append(board[i][j]);
					for(int k = 0; k<(13-board[i][j].toString().length()); k++){
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
		ChessBoard other = (ChessBoard) obj;
		if (!Arrays.equals(blackKingLocation, other.blackKingLocation))
			return false;
		if (!Arrays.deepEquals(board, other.board))
			return false;
		if (!Arrays.equals(whiteKingLocation, other.whiteKingLocation))
			return false;
		return true;
	}
	
}
