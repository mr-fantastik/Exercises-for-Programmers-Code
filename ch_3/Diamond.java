package ch_3;

public class Diamond {
	
	public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }

	public static void main(String[] args) {
		
		String space = " ";
		String star = "*";
		
		int count1 = 1;
		int count2 = 10;
			
			
		for(int i = 0; i < 10; i++) {

			
			System.out.print(repeat(space, count2));
			System.out.println(repeat(star, count1));
			
			count1+=2;
			count2--;	
		}
		
		for(int j = 0; j<= 10; j++) {
			System.out.print(repeat(space, count2));
			System.out.println(repeat(star, count1));
			
			count1-=2;
			count2++;
		}		
	}
}
