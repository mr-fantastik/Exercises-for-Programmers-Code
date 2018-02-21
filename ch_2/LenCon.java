package ch_2;
public class LenCon {

	public static void main(String[] args) {
		
		double inches, meters;
		int counter;
		
		counter = 0;
		for(inches = 0; inches <= 144; inches++) {
			meters = inches/39.37;
			System.out.println(inches + " inches is " + meters + " meters.");
			
			counter++;
			if(counter == 12) {
				System.out.println();
				counter = 0;
			}
		}
		

	}

}
