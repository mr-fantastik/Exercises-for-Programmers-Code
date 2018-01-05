import java.io.IOException;

class ConsoleDemo {
   public static void main(String args[]) 
	   throws IOException {
	   	byte data[] = new byte[10];
	   	
	   	System.out.println("Enter some chars:");
	   	System.in.read(data);
	   	System.out.print("You entered: ");
	   	for(int i=0; i<data.length; i++)
	   		System.out.print((char) data[i]);
   }
}