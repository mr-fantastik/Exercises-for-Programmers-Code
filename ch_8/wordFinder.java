/*
 * Given an input file, read the file and look for all occurrences of a given word. 
 * Replace each occurrence with a replacement. 
 * Write the modified file to a new file.
 */
package ch_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class wordFinder {
	List<String> lines = new ArrayList<String>();
	String st;

	public void fileWrite() throws IOException {
		//open file and pass it to a BufferedReader
		File f1 = new File("dummy.txt");
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		//loops replacing "given word" with "new word"
		//adding it to List 'lines'
		while((st = br.readLine()) != null) {
			if (st.contains("far"))
				st = st.replace("far", "FAR");
			lines.add(st);		
		}
		
		//writes contents of 'lines'
		FileWriter fw = new FileWriter(f1);
		BufferedWriter out = new BufferedWriter(fw);
		for(String s : lines)
			out.write(s);
		out.flush();
		br.close();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		wordFinder wf = new wordFinder();
		wf.fileWrite();
		
	}

}
