package ch_5;

import java.util.Scanner;

public class inputsValidator {
	
	public static boolean firstCheck(String firstName) {
		if(firstName.length() == 0) {
			System.out.println("You must enter a value.");			
			return false;}
		else if(firstName.matches("^\\w{1,2}$")) {
			System.out.println(firstName + " is too short.");
			return false;}
		else {
			return true;}
	}
	
	public static boolean lastCheck(String lastName) {
		if(lastName.length() == 0) {
			System.out.println("You must enter a value.");			
			return false;
		}
		else if(lastName.matches("^\\w{1,2}$")) {
			System.out.println(lastName + " is too short.");
			return false;
		}
		else {
			return true;
		}
	}
	
	public static boolean zipCheck(String zip) {
		if(zip.matches("^[0-9]{5}")) {
			return true;
		}
		else {
			System.out.println(zip + " is an incompatible zip");
			return false;
		}
	}
	
	public static boolean idCheck(String ID) {
		if(ID.matches("^[A-Z]{2}-[0-9]{4}")) {	
			return true;
		}
		else {
			System.out.println("Invalid ID input");
			return false;
		}		
	}
	
	public static void checkAll(String firstName, String lastName, String zip, String ID) {
			firstCheck(firstName);
			lastCheck(lastName);
			zipCheck(zip);
			idCheck(ID);
		if(firstCheck(firstName)==true && lastCheck(lastName)==true && zipCheck(zip)==true && idCheck(ID)==true) {
			System.out.println("All good!");
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String firstName, lastName, zip, ID;
		
		System.out.println("Enter a first name:");
		firstName = sc.nextLine();
		System.out.println("Enter a last name:");
		lastName = sc.nextLine();
		System.out.println("Enter a zip code:");
		zip = sc.nextLine();
		System.out.println("Enter an ID code:");
		ID = sc.nextLine();
		
		
		
		checkAll(firstName, lastName, zip, ID);

	}

}