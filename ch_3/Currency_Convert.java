package ch_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Currency_Convert {
	
	private static DecimalFormat df2 = new DecimalFormat(".##");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double euro, dollar, rate;
		
		System.out.println("Enter a Euro amount:");
		euro = sc.nextDouble();
		System.out.println("Enter an exchange rate %:");
		rate = sc.nextDouble();
		
		dollar = (euro*(rate/100));
		
		System.out.println("The dollar amount at " + rate + " is, " + String.format("%.2f",dollar) + " in total.");
	}

}
