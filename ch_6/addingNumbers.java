/*
   Write a program that prompts the user for five numbers 
   and computes the total of the numbers. 

    Modify the program to prompt for how many numbers to add, 
    instead of hard-coding the value. 
    Be sure you convert the input to a number before doing the comparison.

    Modify the program so that it only adds numbers and 
    silently rejects non-numeric values. 
    Count these invalid entries as attempts anyway. 
    In other words, if the number of numbers to add is 5, 
    your program should still prompt only five times.
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
				count1++;
				sc.next();
			}
		}
		System.out.println(sum);
		sc.close();
	}
	
}
