import java.util.Scanner;

public class SayHello {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String hello = sc.nextLine();
		
		System.out.println("Hello, " + hello + ", nice to meet you!");

	}

}
