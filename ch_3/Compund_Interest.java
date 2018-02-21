package ch_3;

import java.util.Scanner;

public class Compund_Interest {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double principal, rate, time, accrued, compound, periods;
		
		do {
			try{
				System.out.println("Enter a princple amount:");
				principal = sc.nextDouble();
				System.out.println("Enter a rate amount:");
				rate = sc.nextDouble();
				System.out.println("Enter a time amount:");
				time = sc.nextDouble();
				System.out.println("Enter a period amount:");
				periods = sc.nextDouble();
				break;
			} catch(Exception e) {
				System.out.println("OOPS!:" + e);} 
				sc.next();
			}
			while(true);
		
		rate = rate/100;
		compound = principal * Math.pow((1 + rate/periods),(time*periods));
		

		System.out.println("$" + String.format("%.2f", compound) +" in total.");
	sc.close();	
	}
}