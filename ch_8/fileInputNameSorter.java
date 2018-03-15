package ch_8;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class fileInputNameSorter {
	
	
	public static void main(String[] args) throws IOException {
		  //File object used to read 'names.txt', wrapped in a Scanner
		  Scanner s = new Scanner(new File("names.txt"));
		  
		  //List 'list' stores values from 'names.txt'
		  List<String> list = new ArrayList<String>();
		  
		  //loops, adding 's' to 'list', chained to .useDelimeter()
		  //splitting at ", "
		  while (s.hasNext()){
		      list.add(s.useDelimiter(", ").next());  
		  }
		  
		  //'Collections.sort()', sorts 'list' alphabetically
		  Collections.sort(list);
		  
		  //console output
		  list.forEach(System.out::println);
		  s.close();
	}
}