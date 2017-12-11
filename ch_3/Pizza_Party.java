package ch_3;

import java.util.Scanner;

public class Pizza_Party {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int people, pizzas;
		
		System.out.println("How many people are there?");
		people = sc.nextInt();
		
		System.out.println("How many pizzas do you have?");
		pizzas = sc.nextInt();
		
		System.out.println();
		
		//Business logic, each pizza has 8 slices divided between the number of people
		int slices = (pizzas * 8)/people;
		int leftOvers = (pizzas * 8)%people;
		
		System.out.println(people + " people get " + slices + " each, with " + leftOvers + " left.");

	}

}
