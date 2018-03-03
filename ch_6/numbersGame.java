/*
 * Write a Guess the Number game that has three levels of difficulty.
 * Don’t allow any non-numeric data entry.
 * During the game, count non-numeric entries as wrong guesses.
 */
package ch_6;

import java.util.Random;
import java.util.Scanner;

public class numbersGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String upperLimit;
		int high, random;
		int low = 0, guess = 0,  wrong_guess = 0;

		Random r = new Random();
		
		System.out.println("Let's play a number game!");
		
		while(true) {
			System.out.print("Pick a difficulty level(1, 2, 3):");
			upperLimit = sc.nextLine();
			
			if(upperLimit.matches("1")) {
				high = 10;
				break;
			} else if(upperLimit.matches("2")) {
				high = 100;
				break;
			} else if(upperLimit.matches("3")) {
				high = 1000;
				break;
			} else {
				System.out.println("You enter an invalid entry, try again!"); 
				sc.next();
			}
		}
		
		random = r.nextInt(high - low);
		
		do {			
			System.out.print("Enter a guess:");
			if(sc.hasNextInt()) {
				guess = sc.nextInt();
				if(guess < random) {
					System.out.println("too low!");
				} else if (guess > random) {
					System.out.println("too high!");
					wrong_guess ++;
				}			
			} else {
				System.out.println("Invalid guess");
				sc.next();
				wrong_guess ++;
			}		
		} while(guess != random);
		
		System.out.printf("Congrats!%n" + "You had " + wrong_guess + " wrong guesses");
		
		sc.close();
	}

}
