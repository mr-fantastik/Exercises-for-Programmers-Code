/*
 * Write a program that prompts for response times from a website in milliseconds. 
 * It should keep asking for values until the user enters “done.”
 * The program should print the average time (mean), the minimum time, 
 * the maximum time, and the standard deviation.
 */
package ch_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class computingStatistics {
	
	//method encapsulates logic for calculating the min, max, mean,
	//and standard deviation
	public static void doMath(ArrayList<Integer> list) {
		double sum = 0;
		double stdDev1 = 0;		
		
		//calculates avg
		if(!list.isEmpty()) {
			for (Integer add : list) {
				sum += add;
			}
		}
		
		double mean = sum/list.size();
		
		//a portion of the standard deviation formula
		for(int i = 0; i < list.size(); i++) {
			stdDev1 += Math.pow((list.get(i) - mean), 2);
		}
		
		//should consolidate the rest of the standard deviation formula, 
		//but I'm lazy
		double stdDev2 = stdDev1/list.size();
		double stdDev3 = Math.sqrt(stdDev2);
		
		System.out.println("average: " + mean);
		System.out.println("Min: " + Collections.min(list));
		System.out.println("Max: " + Collections.max(list));
		System.out.printf("Standard deviation: " + "%.2f", stdDev3);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		String input;
		int num;
		
		
		 //loops until 'input' == "done"
		 //parses 'input' for integer values, storing them into ArrayList 'list'
		 
		while (true) {
			System.out.print("Enter a number:");
			input = sc.nextLine();
			if (input.contains("done")) {
				break;
			}
			else {
				num = Integer.parseInt(input);
				list.add(num);
			}
		}
		
		list.forEach(System.out::println);
		
		doMath(list);

		sc.close();
	}

}
