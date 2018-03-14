package ch_8;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class fileInputNameSorter {
	
	
	public static void main(String[] args) throws IOException {		  
		  Scanner s = new Scanner(new File("names.txt"));
		  
		  List<String> list = new ArrayList<String>();
		  
		  while (s.hasNext()){
		      list.add(s.useDelimiter(", ").next());  
		  }
		  
		  Collections.sort(list);

		  list.forEach(System.out::println);
		  s.close();
	}
}