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
