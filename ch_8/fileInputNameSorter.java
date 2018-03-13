package ch_8;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class fileInputNameSorter {
	
	
	public static void main(String[] args) throws IOException {
		/*
		   String workingDir = System.getProperty("user.dir");
		   System.out.println("Current working directory : " + workingDir);

		   File f = new File("names.txt");
		   
		   String currentPath = f.getAbsolutePath();
		   System.out.println("current path is: " + currentPath);
		   
		  System.out.println(f.exists());
		  
		  String contents = new String(Files.readAllBytes(Paths.get("names.txt")));
		  System.out.println("Contents (Java 7) : " + contents);

		  Files.lines(Paths.get("names.txt"), StandardCharsets.UTF_8).forEach(System.out::println);
		 
		
		  Path filePath = new File("names.txt").toPath();
		  Charset charset = Charset.defaultCharset();        
		  List<String> stringList = Files.readAllLines(filePath, charset);
		  String[] stringArray = stringList.toArray(new String[]{});
		  
		  Arrays.sort(stringArray);
		  
		  for (int i = 0; i < stringArray.length; i++) {
			  System.out.printf(stringArray[i] + "%n");
		  }
		   */
		  
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