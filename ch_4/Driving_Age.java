package ch_4;

import java.util.Scanner;

public class Driving_Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		
		do {
			try {
				System.out.println("Enter your age:");
				age = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Exception: " + e);				
			} sc.next();		
		} while(true);	
		
		if(age >=  16) {
			System.out.println("You're good to go!");
		} else {
			System.out.println("You're not tall enough to ride this ride!");
		}
		sc.close();
	}
}