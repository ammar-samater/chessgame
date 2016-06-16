package ui;

import ai.AI;
import board.ChessPiece;
import board.GameBoard;
import board.GameType;
import board.Move;
import factories.AIFactory;
import factories.GameFactory;

/**
 * This class represents a generic board game cycle. Based on user input, the
 * suitable classes are instantiated.
 * 
 * @author ammar samater
 *
 */
public class Main {

	private static GameType gameType;
	private static boolean turn;
	private static View view;
	private static GameBoard board;
	private static Move move = null;
	private static AI ai;

	public static void main(String[] args) {
		

		init();

		while (!board.isGameOver()) {
			if (turn == true) {
				ai.setBoard(board.getCopy());
				Thread thread = new Thread(ai);
				thread.start();
				move = view.getHumanMove();
				try {
					thread.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				move = ai.getAIMove(move);
			}

			board.makeMove(move);
			turn = !turn;
		}
	}

	/**
	 * 
	 */
	private static void init() {
		view = new ConsulView();
		gameType = view.getGameType();
		board = GameFactory.getGameBoard(gameType);
		turn = view.getFirstPlayer(); 		// if true then human is white
		ai = AIFactory.getGameAI(gameType, turn);
	}
}

