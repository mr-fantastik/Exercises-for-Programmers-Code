/*
 * Write a quick calculator that prompts for the rate of return 
 * on an investment and calculates how many years it will take 
 * to double your investment.
 * 
 * The formula is
 * years = 72/r
 */
package ch_6;

import java.util.Scanner;



public class handleBadInput {
	
	public static void badInput() {
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

	public static void main(String[] args) {	
		
		badInput();
	}

}
