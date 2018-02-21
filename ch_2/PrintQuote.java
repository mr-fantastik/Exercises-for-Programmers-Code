package ch_2;
import java.util.Scanner;

public class PrintQuote {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quote something:");
		String quote = sc.nextLine();
		
		System.out.println("Who said it?");
		String person = sc.nextLine();
		
		System.out.println(person + " says, " + '"' + quote + '"');
	}

}
