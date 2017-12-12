import java.util.Calendar;
import java.util.Scanner;

public class RetirementCalc {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int age, ret;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your current age?");
		age = sc.nextInt();
		
		System.out.println("What do you want to retire at?");
		ret = sc.nextInt();
		
		ret = (now.get(Calendar.YEAR)+ (ret - age));
		
		System.out.println("It's " + (now.get(Calendar.YEAR)) + ", you can retire in " + ret + ".");
	}

}
