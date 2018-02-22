/*
 Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.

Create a program that compares two strings and determines if the two strings are anagrams. 
The program should prompt for both input strings and display the output as shown in the example that follows.
 */
package ch_5;

import java.util.Scanner;

public class anagramChecker {
	
	/*
	 This is the most batshit crazy function, and I have no idea why it works,
	 but it returns 'true' if the two strings are anagrams of each other
	 and false if they are not.
	 */
	
	public static boolean isAnagram(String string1, String string2, 
			int countUp, int countDown) {
		//initial check to see the two strings are the same length
		if(string1.length() != string2.length())  return false;
		
		//for loop iterates over string1.length()
		for(int count = 0; count < string1.length(); count++){
			/*conditional check compares string1 & string2 charAt using 
			 countUp & countDown as index place holders
			 */
		if(string1.charAt(countUp)!=string2.charAt(countDown)) return false;
		
		countDown--;
		countUp++;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String string1 = null;
		String string2 = null;

		
		System.out.println("Enter a string");
		string1 = sc.nextLine();
		
		System.out.println("Enter another string");
		string2 = sc.nextLine();
		
		int countUp=0;
		int countDown = string2.length()-1;
		
		/*
		 isAnagram is called, and conditional checks for a 'true' value
		 otherwise outputs 'false'
		 */
		if(isAnagram(string1, string2, countUp, countDown) == true) 
			System.out.println("True");
		else 
			System.out.println("false");
	
		sc.close();
	}
}
