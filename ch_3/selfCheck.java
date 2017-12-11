package ch_3;

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class selfCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double items[] = new double[3];
		
		for(int j=0; j < 3; j++) {
			System.out.println("Enter a price:");
			items[j] = sc.nextDouble();
		}
		
		double sub = 0;
		
		//sum the array items for sub-total
		for(int i=0; i < 3; i++) {
			sub += items[i];
		}
		
		//business logic, calculation of tax and total
		double tax = sub * .055;
		double total = tax + sub;
		
		System.out.println(sub);
		System.out.println(tax);
		System.out.printf("%.2f", total);
	
		sc.close();
	}

}
