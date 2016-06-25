package ui;

import ai.AI;
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
	private static boolean isHumanTurn;
	private static View view;
	private static GameBoard board;
	private static Move move;
	private static AI ai;
	private static boolean moveIsAccepted;
	
	public static void main(String[] args) {
	

		init();
		
		
		while (!board.isGameOver()) {
			view.displayBoard(board);
			if (isHumanTurn) {
				Thread thread = new Thread(ai);
				thread.start();
				moveIsAccepted = false;
				while(!moveIsAccepted){
					move = view.getHumanMove();
					if(!board.moveIsLegal(move)){
						view.displayErrorMessage("move is not legal!");
					}else{
						if(!board.moveIsValid(move)){
							view.displayErrorMessage("move is not valid!");
						}else{
							moveIsAccepted = true;
						}
					}
				}
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
			isHumanTurn = !isHumanTurn;
		}
		
		if(isHumanTurn){
			view.announceWinner("You Lose");
		}else{
			view.announceWinner("You Win");
		}
	}

	/**
	 * 
	 */
	private static void init() {
		view = new ConsulView();
		gameType = view.getGameType();
		board = GameFactory.getGameBoard(gameType);
		isHumanTurn = view.getFirstPlayer(); 		// if true then human is white
		ai = AIFactory.getGameAI(gameType, isHumanTurn, board.getCopy());
	}
}

