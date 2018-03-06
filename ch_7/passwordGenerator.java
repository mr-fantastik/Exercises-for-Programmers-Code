package ch_7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class passwordGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random rnd = new Random();
				
		int length;
		
		System.out.print("Enter a length:");
		length = sc.nextInt();
		
		String charCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String symbols = "!@#$%^&*()";
		
		String passSymbols = charCaps + chars + nums + symbols;
		
		char[] password = new char[length];
		
		for (int i = 0; i < length; i++) {
			password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
		}

		System.out.print(password);
	}

}
