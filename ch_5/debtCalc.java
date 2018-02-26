package ch_5;

import java.util.Scanner;

public class debtCalc {
	
	public static double timeToPayOff(double APR, double balance, double payment){
		double months;
		APR /= 36500.00;
		
		months = (-1/30.0) * Math.log(1 + ((balance/payment) * (1 - (Math.pow((1 + APR), 30)))))
				/Math.log(1 + APR);

		return months;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double APR, balance, payment;
		
		System.out.println("Input balance");
		balance = sc.nextDouble();
		System.out.println("Input APR");
		APR = sc.nextDouble();
		System.out.println("Input payment");
		payment = sc.nextDouble();
		

		System.out.println(Math.nextUp(debtCalc.timeToPayOff(APR, balance, payment)));

		
		sc.close();
	}

}
