/*
 * Create a small program that contains a list of employee names. 
 * Print out the list of names when the program runs the first time. 
 * Prompt for an employee name and remove that specific name from the list of names. 
 * Display the remaining employees, each on its own line.
 */

package ch_7;

import java.util.ArrayList;
import java.util.Scanner;

public class empRemoveList {
	
	//outputs contents of ArrayList 'names'
	public static void namesPrint(ArrayList<String> names) {
		names.forEach(System.out::println);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String deleteName;
		
		ArrayList<String> names = new ArrayList<String>();		
		names.add("John");
		names.add("Jackie");
		names.add("Chris");
		names.add("Amanda");
		names.add("Jeremy");
		
		namesPrint(names);
		
		//loops until user inputs a valid entry from ArrayList 'names' to remove
		while (true) {
			System.out.println("Enter a name to delete:");
			deleteName = sc.nextLine();
			
			if(names.contains(deleteName)) {
				names.remove(deleteName);
				break;
			} else {
				System.out.println("That's not in the list!");
			}
		}
		
		namesPrint(names);
	
		sc.close();
	}
}
