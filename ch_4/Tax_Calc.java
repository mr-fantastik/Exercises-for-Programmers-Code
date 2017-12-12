package ch_4;

import java.util.Scanner;

public class Tax_Calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double order, tax, total;
		double rate = 0.055;
		
		
		System.out.println("Enter an amount:");
		order = sc.nextDouble();
		System.out.println("Enter a state:");
		String state = sc.next();
		
		//Sets total to order amount
		total = order;
		
		//Conditional is true if user inputs "Wi", adding sales tax to the total
		if(state.equals("Wi")) {
			total = order + (order*rate);
			tax = order*rate;
			
			System.out.println("The subtotal is " + order + ".\nThe Tax is " + tax + ".");
		}
		
		System.out.println("total: $" + total);
	}
}
