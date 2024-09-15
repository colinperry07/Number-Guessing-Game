package main;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int tries = 3;
		
		System.out.println("What's the largest number you want to guess to:");
		int valueMax = input.nextInt() + 1;
		
		int programChoice = rand.nextInt(valueMax);
		if (programChoice == 0) {
			programChoice += 1;
		}

		while (tries >= 1) {
			System.out.println("Guess a number between 1 and " + (valueMax - 1));
			int guess = input.nextInt();
			if (guess == programChoice) {
				System.out.println("Correct! The number was " + programChoice + "!");
				break;
			} else {
				tries -= 1;
				if (tries >= 1) {
					if (guess > programChoice) {
						System.out.println("Incorrect! Try guessing lower! " + tries + " guess(es) left!");
					} else {
						System.out.println("Incorrect! Try guessing higher! " + tries + " guess(es) left!");
					}
				} else {
					System.out.println("Nice Try! The number was " + programChoice + ". Better luck next time!");
					break;
				}
				
			}
		}
		
		input.close();
		
	}

}
