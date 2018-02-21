package ch_2;
import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a noun:");
		String noun = sc.nextLine();
		
		System.out.println("Enter a verb:");
		String verb = sc.nextLine();
		
		System.out.println("Enter an adj.:");
		String adj = sc.nextLine();
		
		System.out.println("Enter an adv:");
		String adv = sc.nextLine();
		
		System.out.println("Do you " + verb + " your " + adj + " " + adv + " " + noun + "?"  );
	}

}
