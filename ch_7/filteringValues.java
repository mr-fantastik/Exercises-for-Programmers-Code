/*
 * Create a program that prompts for a list of numbers, 
 * separated by spaces.
 * 
 * Have the program print out a new list containing only the even numbers.
 * 
 * Convert the input to an array. 
 * Many languages can easily convert strings to arrays with a built-in 
 * function that splits apart a string based on a specified delimiter.
 * 
 * - Write your own algorithm—don’t rely on the language’s built-in filter
 * or similar enumeration feature.
 * - Use a function called filterEvenNumbers to encapsulate the logic for this. 
 * - The function takes in the old array and returns the new array.
 */

package ch_7;

import java.util.ArrayList;
import java.util.Scanner;


public class filteringValues {
	
	//fileterEvenNumbers() takes a string 'input' and returns an ArrayList 'list'
	//of integers '%2==0'
	public static ArrayList<Integer> filterEvenNumbers(String input) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//inputArray[] contains values delimited by spaces
		String[] inputArray = input.split("\\s+");
		
		//loops through inputArray adding values to ArrayList 'list' if the 
		//parsed string is an integer '%2==0'
		for (int i = 0; i < inputArray.length; i++) {
			 String numberAsString = inputArray[i];
			 if (Integer.parseInt(numberAsString) % 2 == 0) {
				 list.add(Integer.parseInt(numberAsString));
			 }			 
		}		
		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input;
		
		//console 'input'
		System.out.print("Enter a list of numbers, separated by spaces: ");
		input = sc.nextLine();		
		
		//where the magic happens
		ArrayList<Integer> numberList = filterEvenNumbers(input);
		
		//console output
		numberList.forEach(System.out::println);
	
		sc.close();
	}
}
