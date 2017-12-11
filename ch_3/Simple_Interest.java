package ch_3;

import java.util.Scanner;

public class Simple_Interest {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double principle, rate, time, accrued, total;
		do {
			try{
				System.out.println("Enter a princple amount:");
				principle = sc.nextDouble();
				System.out.println("Enter a rate amount:");
				rate = sc.nextDouble();
				System.out.println("Enter a time amount:");
				time = sc.nextDouble();
				break;
			} catch(Exception e) {
				System.out.println("OOPS!:" + e);} 
				sc.next();
			}
			while(true);
		
		rate = rate/100;
		
		accrued = (principle*rate)*time;
		total = accrued + principle;

		System.out.println("$" + total +" in total.");
	}

}
