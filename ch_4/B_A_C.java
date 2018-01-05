package ch_4;

import java.util.Scanner;

public class B_A_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int wt, gndr, drnks, alcVol, time = 0;
		
		do {
			System.out.println("Please enter a weight:");
			while(!sc.hasNextInt()) {
				String input = sc.next();
				System.out.printf("\"%s\" is not a valid input.\n", input);
			}
			wt = sc.nextInt();
		} while (wt <= 0);
		
		System.out.printf("You entered %d. \n" , wt);

	}

}
