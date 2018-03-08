/*
 * Create a program that generates a secure password. 
 * Prompt the user for the minimum length, the number of special characters, 
 * and the number of numbers. 
 * 
 * Then generate a password for the user using those inputs.
 * 
 * Use lists to store the characters you’ll use to generate the passwords.
 * Add some randomness to the password generation.
 */

package ch_7;

import java.util.Random;
import java.util.Scanner;

public class passwordGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//lists of strings where random values are pulled from
		String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerChars = upperChars.toLowerCase();
		String alphabet = upperChars + lowerChars;
		String numbers = "0123456789";
		String specChars = "!@#$%^&*()_-+=<>?";
		
		//char[] length variables
		int pwLength, numbersVar, specCharVar;
		
		Random rand = new Random();

		//console input
		System.out.print("Enter a minimum password length: ");
		pwLength = sc.nextInt();		
		System.out.print("Enter a numbers variable: ");
		numbersVar = sc.nextInt();		
		System.out.print("Enter a special characters variable: ");
		specCharVar = sc.nextInt();		
		
		char password[] = new char[pwLength];
		char numbersPW[] = new char[numbersVar];
		char specCharPW[] = new char[specCharVar];			
		
		//program logic with three 'for' loops to generate random values from stored Strings
		for (int i = 0; i < pwLength; i++) {
			password[i] = alphabet.charAt(rand.nextInt(alphabet.length() - 1));
		}
		
		for (int i = 0; i < numbersVar; i++) {
			numbersPW[i] = numbers.charAt(rand.nextInt(numbers.length() - 1));
		}
		
		for (int i = 0; i < specCharVar; i++) {
			specCharPW[i] = specChars.charAt(rand.nextInt(specChars.length() - 1));
		}
		
		//Concatenate all the char[] into one String 'masterPass'
		String masterPass = (String.valueOf(password)) + (String.valueOf(numbersPW)) + (String.valueOf(specCharPW));
		
		//Generated password output
		System.out.println(masterPass);
		
		sc.close();
	}

}
