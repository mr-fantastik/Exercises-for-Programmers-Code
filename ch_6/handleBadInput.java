package ch_6;

import java.util.Scanner;

public class handleBadInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double rate = 0;
		
		while(true) {
			System.out.println("Enter a rate:");
			if((!sc.hasNextDouble()) || (sc.hasNext("0"))) {
				System.out.println("That's not a valid input!");
				sc.next();
			}
			else {
				rate = sc.nextDouble();
				break;
			}
		}

		double years = 72/rate;
		System.out.println((int)Math.ceil(years));
		
		
		sc.close();
	}

}
