/*
  	Create a program that determines the complexity of a given password based on these rules:

    A very weak password contains only numbers and is fewer than eight characters.

    A weak password contains only letters and is fewer than eight characters.

    A strong password contains letters and at least one number and is at least eight characters.

    A very strong password contains letters, numbers, and special characters and is at least eight characters.
 */

package ch_5;

import java.util.Scanner;

public class passwordStrength {
	
	//pwStrength() method returns an int based on a String and regex comparisons		
	public static int pwStrength(String string) {
		
		if (string.matches("^\\d{1,7}$")) {return 1;}
		else if (string.matches("^[a-zA-Z]{1,7}$")) {return 2;}
		else if (string.matches("^[a-zA-Z\\d]{8,15}$")) {return 3;}
		else if (string.matches("^[a-zA-Z\\d\\D]{8,15}$")) {return 4;}
		else return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String string;
		
		//loops until user inputs a string between 1 & 15 characters
		do {
		System.out.println("Enter a string within 15 characters");
		string = sc.nextLine();
		} while((string.length() < 1) || (string.length() > 15));
		
		//switch statement outputs based on pwStrength()'s return value
		switch (pwStrength(string)) {
			case 0:
				System.out.println("error");
				break;
			case 1:
				System.out.println("very weak");
				break;
			case 2:	
				System.out.println("weak");
				break;
			case 3:	
				System.out.println("medium");
				break;
			case 4:	
				System.out.println("strong");
				break;
		}
		
		sc.close();
	}

}
