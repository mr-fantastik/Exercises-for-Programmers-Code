import java.util.Scanner;

public class numClass {
    
	private static int gcd (int n, int d) {
        // REQUIRES: n and d to be greater than zero
        // the gcd is computed by repeated subtraction
        while (n != d)
           if (n > d) n = n - d; else d = d - n;
        return n;
      }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, 
		d;
		
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		System.out.print("Enter another number: ");
		d = sc.nextInt();
		
		System.out.println(gcd(n, d));
	}

}
