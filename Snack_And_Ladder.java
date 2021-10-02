package com.bridgelabz;

public class Snack_And_Ladder {
	public static void main(String[] args) {
		System.out.println("Player Exact Winning Position is: ");

		// Declared Constants and Assigning variables
		int NO_PLAY = 0;
		int is_Ladder = 1;
		int is_Snake = 2;
		int WINNING_POSITION = 100;
		int position = 0; // Initializing Variable

		// while loop use to execute Condition
		while (position < WINNING_POSITION) {

			// to roll a dice
			int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
			System.out.println("diceNumber is : " + diceNumber);

			// check option after getting a diceNumber
			int option = (int) Math.floor(Math.random() * 10) % 2;
			System.out.println("selected player option : " + option);

			switch (option) {
			case 1:
				position = diceNumber + position;
				System.out.println("Ladder");
				if (position > 100) {
					position = 100;
					position = position - diceNumber;
				}
				System.out.println("position for the player after the ladder is : " + position);
				break;

			case 2:
				position = position - diceNumber;
				System.out.println("Snack");
				if (position < 0) {
					position = 0;
					System.out.println("Player restart from zero: ");
				}
				System.out.println("position for the player after the Snake is : " + position);
				break;

			default:
				System.out.println("No play");
			}

		}
	}

}
