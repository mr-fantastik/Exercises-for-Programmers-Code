/*
 * Write a program that prompts the user for five numbers 
 * and computes the total of the numbers.
 */
package ch_6;

import java.util.Scanner;

public class addingNumbers {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0, sum = 0;
		int count1 = 0;
		int count2 = 0;
		
		
		System.out.println("How large should count2 be?");
		count2 = sc.nextInt();
		
		while(count1 < count2) {
			System.out.println("Enter an integer:");
			if(sc.hasNextInt()) {
				num = sc.nextInt();
				count1++;
				sum += num;
			} else {
				System.out.println("That's not an int");
				sc.next();
			}
		}
		System.out.println(sum);
		sc.close();
	}
	
}
