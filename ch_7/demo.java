package ch_7;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class demo {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();

		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");

		Collections.sort(fruits);

		int i=0;
		for(String temp: fruits){
			System.out.println("fruits " + ++i + " : " + temp);
		}
	}

}
