package ch_8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class parseDataFile {


	public static void main(String[] args) throws FileNotFoundException {
		String fileInput;
		
		List<String> dataList = new ArrayList<String>();
		
		
		try(BufferedReader br = new BufferedReader(new FileReader("dataFile.txt")))
		
		{
			while((fileInput = br.readLine()) != null) {
				dataList.add(fileInput.replaceAll(",", "  "));
			}
		} catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
		
		System.out.println("Last  First  Salary");
		System.out.println("-------------------");
		
		dataList.forEach(System.out::println);
		
	}
}
