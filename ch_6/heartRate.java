/*
 * Create a program that prompts for your age and your resting heart rate. 
 * Use the Karvonen formula to determine the target heart rate 
 * based on a range of intensities from 55% to 95%. 
 * Generate a table with the results as shown in the example output. 
 * The formula is: TargetHeartRate=(((220-age)-restingHR)*intensity)+restingHR
 */
package ch_6;

import java.util.Scanner;

public class heartRate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age, restingHR;
		
		System.out.print("Enter your age:");
		age = sc.nextInt();
		System.out.print("Enter your resting heart rate:");
		restingHR = sc.nextInt();
		
		for(double intensity = 55; intensity < 100; intensity +=5) {
			 double targetHR = Math.round((((220 - age) - restingHR) * (intensity/100)) + restingHR);
			System.out.printf((intensity + "%  |  " + targetHR + "bpm" ));
		}
		sc.close();
	}

}
