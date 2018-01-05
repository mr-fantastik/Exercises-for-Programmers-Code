package ch_4;

import java.util.Scanner;

public class PW_Validator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String store_pw = "abc$123";
		int count = 0;
		
		//do while loop iterates 5 times asking user for correct password input
		do {
			System.out.println("Enter a password: ");
			String user_pw = sc.nextLine();
		
			if(user_pw.equals(store_pw)) {
				System.out.println("Welcome!");
				break;
			} else {
				System.out.println("I don't know you.");
				sc.reset();
			}
			count++;
		} while(count<5);
	
		//Prints "you lose" if user entered wrong password 5 times in previous loop
		//Prints "congrats" if count < 5
		if(count==5) {
			System.out.print("you lose!");
		} else {
			System.out.print("Congrats!");
		}
	}
	

}
