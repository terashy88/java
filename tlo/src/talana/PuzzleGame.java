package talana;
/*

 */

import java.util.Random;

public class PuzzleGame {
	public static void main(String[] args) {
		String eingabe;
		int alter = 0;

		Random random = new Random();
		int zahl = random.nextInt(22) + 1;
		int meineZahl = 0;

		System.out.println("Let's play a Puzzle game");
		System.out.println("You have 4 Try's");
		System.out.print("but first how old are you? ");
		eingabe = System.console().readLine();
		alter = Integer.parseInt(eingabe);

		if (alter >= 18) {
			System.out.println("nice welcome");
			System.out.print("Guess the right number: ");

			for (int i = 4; i >= 0; i--) {
				eingabe = System.console().readLine();
				meineZahl = Integer.parseInt(eingabe);

				if (meineZahl == zahl) {
					System.out.println("You Win");
				} else {
					if (i == 0) {
						System.out.println("you lost");
					} else {
						if (meineZahl > zahl) {
							System.out.println("Your number was to big, try again you have " + i + " try");
						} else {
							System.out.println("Your number was to small, try again you have " + i + " try");
						}
					}
				}
			}

		} else {
			System.out.println("Sorry, this Game is only for Adults..");
		}
	}
}
