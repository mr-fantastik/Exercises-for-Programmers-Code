package ch_4;

import java.util.Scanner;

public class B_A_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int wt, drnks, alcVol, time = 0;
		int gndr;
		int male = 1;
		int female = 2;
		
		do {
			System.out.println("Please enter a weight:");
			while(!sc.hasNextInt()) {
				String input = sc.next();
				System.out.printf("\"%s\" is not a valid input.\n", input);
			}
			wt = sc.nextInt();			
			
			System.out.println("Enter \"1\" for male or \"2\" for female");
			while(!sc.equals(1) || !sc.equals(1)) {
				String input = sc.next();
				System.out.printf("\"%s\" is not a valid input.\n", input);
			}
			gndr = sc.nextInt();
			
		} while (wt <= 0);
		
		System.out.printf("You entered %d. \n" , wt);
	}
}