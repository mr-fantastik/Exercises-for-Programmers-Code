/*
 * Create a program that generates multiplication tables 
 * for the numbers 0 through 12.
 */
package ch_6;

public class multiplicationTable {
	
	public static void multiplyTable() {
		int count1, count2;
		
		for(count1 = 0; count1 <= 12; count1++) {			
			for(count2 = 0; count2 <= 12; count2++) {
				System.out.print(count2 * count1 + " ");				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		multiplyTable();
		
	}

}
