package ch_8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class parseDataFile {


	public static void main(String[] args) throws FileNotFoundException {
		//temporary String value
		String fileInput;
		//List 'dataList' stores contents of 'dataFile.txt' as String values
		List<String> dataList = new ArrayList<String>();
		
		//try/catch block for 'dataFile.txt'
		//FileReader reads contents of 'dataFile.txt', wrapped in a BufferedReader 'br'
		try(BufferedReader br = new BufferedReader(new FileReader("dataFile.txt")))
		
		{
			//loops until 'br' returns a null value
			//'fileInput' is chained to 'replaceAll()',
			//replacing "," with "   "
			while((fileInput = br.readLine()) != null) {
				dataList.add(fileInput.replaceAll(",", "  "));
			}
		} catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
		
		//console output
		System.out.println("Last  First  Salary");
		System.out.println("-------------------");
		
		dataList.forEach(System.out::println);
		
	}
}
