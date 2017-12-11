import java.util.Scanner;

public class SimpleMath {

	public static void main(String[] args) {
		
		int x, y, add, sub, mul;
		double div;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		x = sc.nextInt();
		
		System.out.println("Enter another number:");
		y = sc.nextInt();
		
		add = x + y;
		sub = x - y;
		mul = x * y;
		div = x / y;
		
		System.out.println( x + " + " + y + " = " + add);
		System.out.println( x + " - " + y + " = " + sub);
		System.out.println( x + " * " + y + " = " + mul);
		System.out.println( x + " / " + y + " = " + div);

	}

}
