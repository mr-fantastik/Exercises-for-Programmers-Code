package ch_2;
import java.util.Scanner;

class MoonGrav {
	public static void main(String args[]) {

	  double EarthWt, MoonWt;

	  Scanner sc = new Scanner(System.in);

	  System.out.println("Enter your Earth Weight: ");
	  EarthWt = sc.nextDouble();
	  
	  MoonWt = EarthWt * .17;
	  
	  System.out.println("Your Moon weight is " + MoonWt);

	}
}