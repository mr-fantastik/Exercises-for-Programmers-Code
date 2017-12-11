package ch_3;

import java.util.Scanner;

public class PaintCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double rate = 350;
		
		int width, height;
		
		
		
		do {
			try {
				System.out.println("Enter a width: ");
				width = sc.nextInt();
				System.out.println("Enter a height: ");
				height = sc.nextInt();
				
				int total = width * height;
				int gallons = (int)(Math.ceil(total/rate));
				
				System.out.println("You will need " + gallons + " gallons to paint a " + total + " square foot room.");
						
				break;				
			} catch (Exception e) {
				System.out.println("OOps! " + e);
				sc.next();
			}
		} while(true);			
	}
}
