package ch_8;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class websiteGenerator {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		String siteName, author, jsQuery, cssQuery;
		
		System.out.print("Site name: ");
		siteName = sc.nextLine();
		
		System.out.print("Author's name: ");
		author = sc.nextLine();
		System.out.print("Do you want JS? ");
		jsQuery = sc.nextLine();
		System.out.print("Do you want CSS? ");
		cssQuery = sc.nextLine();
		
		sc.close();
		
		StringBuilder htmlBuilder = new StringBuilder();
		htmlBuilder.append("<html>\n");
		htmlBuilder.append("<head>\n");
		htmlBuilder.append("<title>" + siteName + "</title>\n");
		htmlBuilder.append("<meta name=\"author\" content=\"" + author + "\">\n");
		htmlBuilder.append("</head>\n");
		htmlBuilder.append("</html>");
		String html = htmlBuilder.toString();
		
		File htmlFile =  new File("C:\\Users\\Sizeable_debt\\eclipse-workspace\\Exercises\\" + siteName + "\\index.html");
		System.out.println("Created ./" + siteName);
		if (!htmlFile.getParentFile().mkdirs())  
		{
			throw new IOException("Unable to create " + htmlFile.getParentFile());
		}
		/*
		*/
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(htmlFile));
			bw.write(html);
			System.out.println("Created ./" + siteName  + "/index.html");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(jsQuery.equals("y")) {
			new File("C:\\Users\\Sizeable_debt\\eclipse-workspace\\Exercises\\" + siteName + "\\js").mkdir();
			System.out.println("Created ./" + siteName + "/js");
		}
		if(cssQuery.equals("y")) {
			new File("C:\\Users\\Sizeable_debt\\eclipse-workspace\\Exercises\\" + siteName + "\\css").mkdir();
			System.out.println("Created ./" + siteName + "/css");
		}
		sc.close();
	}

}
