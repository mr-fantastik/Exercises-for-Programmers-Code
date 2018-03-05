/*
 *Arrays don’t have to be hard-coded. 
 *You can take user input and store it in an array and then work with it.
 *Create a program that picks a winner for a contest or prize drawing. 
 *Prompt for names of contestants until the user leaves the entry blank. 
 *Then randomly select a winner.
 */
package ch_7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class winnerPicker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input;
		
		ArrayList<String> names = new ArrayList<String>();
		
		//loops, adding elements to 'names', until user inputs ""
		do {
			System.out.print("Enter a name:");
			input = sc.nextLine();
			if(input.equals("")) {
				break;
			} else { 
				names.add(input);
			}
		} while(!input.equals(""));
		
		names.forEach(System.out::println);
		
		//generates random int within names.size()
		Random r = new Random();
		int randInt = r.nextInt(names.size());
		
		//console output
		System.out.println("Winner is " + names.get(randInt));
		
		sc.close();
	}
}
