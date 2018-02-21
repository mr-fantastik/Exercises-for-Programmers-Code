/*
 Write a program that asks for three numbers. 
 Check first to see that all numbers are different. 
 If they’re not different, then exit the program. 
 Otherwise, display the largest number of the three.
 */

package ch_4;

import java.util.Scanner;

public class comparingNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;	
		
		System.out.println("Enter the first number");
		x = sc.nextInt();
		
		System.out.println("Enter the second number");
		y = sc.nextInt();
		
		System.out.println("Enter the third number");
		z = sc.nextInt();
		
		while(true) {
			if(x==y || x==z) {
				System.out.println("Good bye");			
			} else if (x > y && x > z) {
				System.out.println("The largest number is " + x);
			} else if (y > x && y > z) {
				System.out.println("The largest number is " + y);
			} else if (z > x && z > y) {
				System.out.println("The largest number is " + z); 
			}
			break;
		}
	}	
}
