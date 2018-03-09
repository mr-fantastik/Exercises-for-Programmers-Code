package ch_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class sortingRecords {
	 
		/*class implemented the Comparable interface, and override the compareTo() method 
		 * to compare its quantity property in ascending order
		 * 
		 * To sort an Object by its property, you have to make the Object implement the Comparable interface 
		 * and override the compareTo() method
		 */
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
			
			public String toString() {
				return String.format("%s | %s | %s | %s", firstName, lastName, position, startDate);
			}
		}
	
	public static class EmployeeChainedComparator implements Comparator<employee>	{
		private List<Comparator<employee>> listComparators;
		
		@SafeVarargs
		public EmployeeChainedComparator(Comparator<employee>... comparators) {
			this.listComparators = Arrays.asList(comparators);
		}
	    @Override
	    public int compare(employee emp1, employee emp2) {
	        for (Comparator<employee> comparator : listComparators) {
	            int result = comparator.compare(emp1, emp2);
	            if (result != 0) {
	                return result;
	            }
	        }
	        return 0;
	    }
	}

	public static void main(String[] args) {
		
		class EmployeeLastNameComparator implements Comparator<employee> {
			 
		    @Override
		    public int compare(employee emp1, employee emp2) {
		        return emp1.getlastName().compareTo(emp2.getlastName());
		    }
		}
	
		List<employee> listEmployees = new ArrayList<employee>();
		
		listEmployees.add(new employee("John", "Johnson", "Manager", "2016-12-31"));
		listEmployees.add(new employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
		listEmployees.add(new employee("Michaela", "Michaelson", "District Manager", "2015-12-19"));		
		listEmployees.add(new employee("Jake", "Jacobson", "Programmer", ""));		
		listEmployees.add(new employee("Jacquelyn", "Jackson", "DBA", ""));		
		listEmployees.add(new employee("Sally", "Weber", "Web Developer", "2015-12-18"));		
		
        Collections.sort(listEmployees, new EmployeeChainedComparator(
                new EmployeeLastNameComparator()));
		
        for (employee emp : listEmployees) {
            System.out.println(emp);
        }

	}

}
