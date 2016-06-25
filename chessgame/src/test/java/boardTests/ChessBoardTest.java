/**
 * 
 */
package boardTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import board.ChessBoard;
import board.GameBoard;

/**
 * @author Ammar Samater
 *
 */
public class ChessBoardTest {

	private ChessBoard board;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		board = new ChessBoard();
	}


	/**
	 * Test method for {@link board.ChessBoard#ChessBoard(board.ChessPiece[][])}.
	 */
	@Test
	public void testChessBoardChessPieceArrayArray() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link board.ChessBoard#isGameOver()}.
	 */
	@Test
	public void testIsGameOver() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link board.ChessBoard#makeMove(board.Move)}.
	 */
	@Test
	public void testMakeMove() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link board.ChessBoard#getCopy()}.
	 */
	@Test
	public void testGetCopy() {
		GameBoard copy = board.getCopy();
		assertNotSame(board, copy);
		assertEquals(board, copy);
	}

	/**
	 * Test method for {@link board.ChessBoard#moveIsLegal(board.Move)}.
	 */
	@Test
	public void testMoveIsLegal() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link board.ChessBoard#moveIsValid(board.Move)}.
	 */
	@Test
	public void testMoveIsValid() {
		fail("Not yet implemented"); // TODO
	}

}
