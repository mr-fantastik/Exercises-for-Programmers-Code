package ch_3;

import java.util.Scanner;

public class Super_Pizza_Party {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int people, slices;
		double pizzas;
		
		
		
		System.out.println("How many people are there?");
		people = sc.nextInt();
		
		System.out.println("How many slices does each person want?");
		slices = sc.nextInt();
		
		pizzas = (double)(people*slices)/8;
		
		System.out.println("You need a total of " + ((int)Math.ceil(pizzas)) + " pizzas.");
		
		sc.close();
	}
}
