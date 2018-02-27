package ch_5;

import java.util.Scanner;

public class debtCalc {
	
	/*
	 * calculateMonthsUntilPaidOff receives an APR, balance, and payment as input, and calculates
	 * the # of months required to payoff the balance given the APR and payment.
	 * Had to reach out to S.O. for help on this, as I was using an 'int' for division, which meant I
	 * was dividing by zero, and had some misplaced brackets in the calculation.
	 */
	public static double calculateMonthsUntilPaidOff(double APR, double balance, double payment){
		double months;
		APR /= 36500.0;
		
		months = (-1.0/30.0) * Math.log(1 + ((balance/payment) * (1 - (Math.pow((1 + APR), 30)))))
				/Math.log(1 + APR);

		return months;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//variables
		double APR, balance, payment;
		
		System.out.println("Input balance");
		balance = sc.nextDouble();
		System.out.println("Input APR");
		APR = sc.nextDouble();
		System.out.println("Input payment");
		payment = sc.nextDouble();
		
		//output rounds-up 'months' using Math.ceil and then casts the return to an 'int'
		System.out.println((int)Math.ceil(debtCalc.calculateMonthsUntilPaidOff(APR, balance, payment)));

		
		sc.close();
	}

}
