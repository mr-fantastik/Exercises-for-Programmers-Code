
public class FizzBuzz {

	public static void main(String[] args) {
		
		int Count = 100;
		
		while(Count >= 1) {
			if((Count%3==0 ) && (Count%5==0)) {
				System.out.println("fizzBuzz");
			} else if (Count%3==0) {
				System.out.println("fizz");
			} else if (Count%5==0) {
				System.out.println("Buzz");
			} else {System.out.println(Count);}
			
			Count --;
		}
		

	}

}
