/*
 * Create a program that reads in a file and counts the frequency of words in the file. 
 * Then construct a histogram displaying the words and the frequency, 
 * and display the histogram to the screen.
 */
package ch_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class frequencyFinder {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("dummy.txt"));
		Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
		
		while(sc.hasNext()) {
			String next = sc.next().toLowerCase();
			if(!wordCounts.containsKey(next)) {
				wordCounts.put(next, 1);
			} else {
				wordCounts.put(next, wordCounts.get(next) + 1);
			}
		}
		
		System.out.println("Number of words: " + wordCounts.size());
		for(String word : wordCounts.keySet()) {
			System.out.println("Word: " + word + " " + wordCounts.get(word));
		}
	}
}
