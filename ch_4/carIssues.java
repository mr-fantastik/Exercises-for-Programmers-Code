/*
 Create a program that walks the user through troubleshooting issues with a car. 
 Use the following decision tree to build the system:
 */

package ch_4;

import java.util.Scanner;

public class carIssues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		/*
		 This is the most horrendous series of nested if/else statements.
		 Which goes five levels deep.
		 Maybe there are worse things in life, but I'm not sure.
		 */
		System.out.println("Is the car silent when turning the key?");
		input = sc.nextLine();
		//level 1
		if(input.equals("yes")) {
			System.out.println("Are the battery terminals corroded?");
			input = sc.nextLine();
			//level 2
			if(input.equals("yes")) {
				System.out.println("Clean the battery terminals");
			}else {
				System.out.println("Replace the battery cables.");
			}
		}else {
			System.out.println("Does the car make a clicking noise?");
			input = sc.nextLine();
			//level 2
			if(input.equals("yes")) {
				System.out.print("Replace the battery.");
			} else {
				System.out.println("Does the car crank up but fail to start?");
				input = sc.nextLine();
				//level 3
				if(input.equals("yes")) {
					System.out.println("Check the spark plug.");					
				} else {
					System.out.println("Does the engine start and then die?");
					input = sc.nextLine();
					//level 4
					if(input.equals("yes")) {
						System.out.println("Does your car have fuel injection?");
						input = sc.nextLine();
						//level 5
						if(input.equals("yes")) {
							System.out.println("Get it in for service.");
						} else {
							System.out.println("Check to ensure the choke is opening and closing.");
						}
					}
				}
			}
		}

	}

}
