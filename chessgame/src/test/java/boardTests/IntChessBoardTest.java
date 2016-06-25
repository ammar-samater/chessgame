/**
 * 
 */
package boardTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import board.ChessBoard;
import board.GameBoard;
import board.IntChessBoard;

/**
 * @author Ammar Samater
 *
 */
public class IntChessBoardTest {

	private IntChessBoard board;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		board = new IntChessBoard();
	}



	/**
	 * Test method for {@link board.IntChessBoard#isGameOver()}.
	 */
	@Test
	public void testIsGameOver() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link board.IntChessBoard#makeMove(board.Move)}.
	 */
	@Test
	public void testMakeMove() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link board.IntChessBoard#getCopy()}.
	 */
	@Test
	public void testGetCopy() {
		GameBoard copy = board.getCopy();
		assertNotSame(board, copy);
		assertEquals(board, copy);
	}

	/**
	 * Test method for {@link board.IntChessBoard#moveIsLegal(board.Move)}.
	 */
	@Test
	public void testMoveIsLegal() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link board.IntChessBoard#moveIsValid(board.Move)}.
	 */
	@Test
	public void testMoveIsValid() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link board.IntChessBoard#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		fail("Not yet implemented"); // TODO
	}

}
