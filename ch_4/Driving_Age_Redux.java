package ch_4;

import java.util.Scanner;

public class Driving_Age_Redux {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		
		do {
			System.out.println("Enter your age: ");
			if(!sc.hasNextLine()) {
				sc.next();
				continue;
			}
			age = sc.nextInt();
			break;
		} while(true);
		
		if (age < 16) {
			System.out.println("Too young!");
		} else {
			System.out.println("Good to go!");
		}
	}

}
	

