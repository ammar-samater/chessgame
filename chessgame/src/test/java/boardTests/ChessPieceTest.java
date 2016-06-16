/**
 * 
 */
package boardTests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import board.ChessPiece;

/**
 * @author ammar_000
 *
 */
public class ChessPieceTest {



	/**
	 * Test method for {@link board.ChessPiece#getValue()}.
	 */
	@Test
	public void test_getValue_for_white_pieces_returns_positive_numbers() {
		assertEquals(1, ChessPiece.WHITE_PAWN.getValue());
		assertEquals(2, ChessPiece.WHITE_ROOK.getValue());
		assertEquals(3, ChessPiece.WHITE_KNIGHT.getValue());
		assertEquals(4, ChessPiece.WHITE_BISHOP.getValue());
		assertEquals(5, ChessPiece.WHITE_KING.getValue());
		assertEquals(6, ChessPiece.WHITE_QUEEN.getValue());
	}
	
	/**
	 * Test method for {@link board.ChessPiece#getValue()}.
	 */
	@Test
	public void test_getValue_for_black_pieces_returns_negative_numbers() {
		assertEquals(-1, ChessPiece.BLACK_PAWN.getValue());
		assertEquals(-2, ChessPiece.BLACK_ROOK.getValue());
		assertEquals(-3, ChessPiece.BLACK_KNIGHT.getValue());
		assertEquals(-4, ChessPiece.BLACK_BISHOP.getValue());
		assertEquals(-5, ChessPiece.BLACK_KING.getValue());
		assertEquals(-6, ChessPiece.BLACK_QUEEN.getValue());
	}

	/**
	 * Test method for {@link board.ChessPiece#get(int)}.
	 */
	@Test
	public void test_getChessPiece_for_white_pieces() {
		assertEquals(ChessPiece.WHITE_PAWN, ChessPiece.getChessPiece(1));
		assertEquals(ChessPiece.WHITE_ROOK, ChessPiece.getChessPiece(2));
		assertEquals(ChessPiece.WHITE_KNIGHT, ChessPiece.getChessPiece(3));
		assertEquals(ChessPiece.WHITE_BISHOP, ChessPiece.getChessPiece(4));
		assertEquals(ChessPiece.WHITE_KING, ChessPiece.getChessPiece(5));
		assertEquals(ChessPiece.WHITE_QUEEN, ChessPiece.getChessPiece(6));
	}
	
	/**
	 * Test method for {@link board.ChessPiece#get(int)}.
	 */
	@Test
	public void test_getChessPiece_for_black_pieces() {
		assertEquals(ChessPiece.BLACK_PAWN, ChessPiece.getChessPiece(-1));
		assertEquals(ChessPiece.BLACK_ROOK, ChessPiece.getChessPiece(-2));
		assertEquals(ChessPiece.BLACK_KNIGHT, ChessPiece.getChessPiece(-3));
		assertEquals(ChessPiece.BLACK_BISHOP, ChessPiece.getChessPiece(-4));
		assertEquals(ChessPiece.BLACK_KING, ChessPiece.getChessPiece(-5));
		assertEquals(ChessPiece.BLACK_QUEEN, ChessPiece.getChessPiece(-6));
	}

}
