package com.bridgelabz;

public class Snack_And_Ladder {
	// Declared Constants Assigning Variables
	static final int WINNING_POSITION = 100;
	static final int IS_LADDER = 1;
	static final int IS_SNAKE = 0;

	static String turn = "player1";

	public static void main(String[] args) {
		System.out.println("Game With Player2: ");
		// Declaring and Initializing
		int diceCount = 0;
		int player1Position = 0;
		int player2Position = 0;
		int player1DiceCount = 0;
		int player2DiceCount = 0;

		while (player1Position < WINNING_POSITION && player2Position < WINNING_POSITION) {
			++diceCount;
			if (turn.equals("player1")) {
				turn = "player2";
				++player1DiceCount;
				player1Position = getPosition(player2Position);
			} else {
				++player2DiceCount;
				turn = "player1";
				player2Position = getPosition(player2Position);
			}
		}

		if (player1Position == WINNING_POSITION) {
			System.out.println("player1 dice count " + player1DiceCount);
			System.out.println("player1 win the game");

		} else {
			System.out.println("player2 dice count " + player2DiceCount);
			System.out.println("player2 win the game");

		}
		System.out.println("Total dice count " + diceCount);
		System.out.println("player1 position is " + player1Position);
		System.out.println("player2 position is " + player2Position);

	}

	private static int getPosition(int position) {
		int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("diceNumber is : " + diceNumber);
		int option = (int) Math.floor(Math.random() * 10) % 2;
		System.out.println("selected player option : " + option);

		if (option == IS_SNAKE) {
			System.out.println("Snake for the Player");
			if (position - diceNumber > 0) {
				position = position - diceNumber;

			}
		} else if (option == IS_LADDER) {
			System.out.println("Ladder for the Player");
			if (turn.equals("player1")) {
				turn = "player1";
			} else if (turn.equals("player2")) {
				turn = "player2";
			}
			if (position + diceNumber <= 100) {
				position = position + diceNumber;

			}
		}
		return position;
	}

}
