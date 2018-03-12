package ch_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ch_7.sortingRecords.employee;

public class filteringRecords {
	
 	//model class
	public static class employee{
		private String firstName;
		private String lastName;
		private String position;
		private String startDate;
		
		employee(String firstName, String lastName, String position, String startDate){
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.position = position;
			this.startDate = startDate;
		}
		
		//getters and setters
		public String getfirstName() {
			return firstName;
		}
		public void setfirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getlastName() {
			return lastName;
		}
		public void setlastName(String lastName) {
			this.lastName = lastName;
		}
		public String getposition() {
			return position;
		}
		public void setposition(String position) {
			this.position = position;
		}
		public String getstartDate() {
			return startDate;
		}
		public void setstartDate(String startDate) {
			this.startDate = startDate;
		}
		
		//override toString() provides meaningful info of 'employee' object
		public String toString() {
			return String.format("%s | %s | %s | %s", firstName, lastName, position, startDate);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String searchString;
		
		System.out.print("Enter a substring:");
		searchString = sc.nextLine();

		employee[] employees = new employee[6];
		
		employees[0] = new employee("John", "Johnson", "Manager", "2016-12-31");
		employees[1] = new employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
		employees[2] = new employee("Michaela", "Michaelson", "District Manager", "2015-12-19");		
		employees[3] = new employee("Jake", "Jacobson", "Programmer", "");		
		employees[4] = new employee("Jacquelyn", "Jackson", "DBA", "");		
		employees[5] = new employee("Sally", "Weber", "Web Developer", "2015-12-18");		
		
		for(int i = 0; i < employees.length; i++) {
			if(employees[i].getfirstName().contains(searchString)) {
				System.out.println(employees[i]);
			}
			else if(employees[i].getlastName().contains(searchString)) {
				System.out.println(employees[i]);
			}
		}
		

		
	}

}
