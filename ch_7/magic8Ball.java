package ch_7;

import java.util.Random;
import java.util.Scanner;

public class magic8Ball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		String input;
		
		String[] list = {"Yes", "No", "Maybe", "Ask again later"};
		
		do {					
			int randInt = r.nextInt(3);
			
			System.out.print("What's your Question?");
			input = sc.nextLine();
			System.out.println(list[randInt]);
			r.nextInt();
		} while (!input.matches("exit"));	
		
			sc.close();
	}

}
