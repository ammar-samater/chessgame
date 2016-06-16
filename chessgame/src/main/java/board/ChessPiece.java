/**
 * 
 */
package board;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ammar_000
 *
 */
public enum ChessPiece {

	WHITE_PAWN(1), WHITE_ROOK(2), WHITE_KNIGHT(3), WHITE_BISHOP(4), WHITE_KING(5), WHITE_QUEEN(6), 
	BLACK_PAWN(-1), BLACK_ROOK(-2), BLACK_KNIGHT(-3), BLACK_BISHOP(-4), BLACK_KING(-5), BLACK_QUEEN(-6);

	private int value;
	private static final Map<Integer,ChessPiece> lookup = new HashMap<Integer,ChessPiece>();

	/**
	 * Constructor
	 * @param value
	 */
	private ChessPiece(int value) {
		this.value = value;
	}
	
	static {
	      for(ChessPiece piece : EnumSet.allOf(ChessPiece.class))
	           lookup.put(piece.getValue(), piece);
	 }
	
	/**
	 * 
	 * @return
	 */
	public int getValue() { return value; }

	/**
	 * 
	 * @param value
	 * @return
	 */
	public static ChessPiece getChessPiece(int value) { 
	    return lookup.get(value); 
	}

}
