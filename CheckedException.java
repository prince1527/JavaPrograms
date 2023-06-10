import java.io.*;
public class CheckedException {

	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		FileInputStream fis = null;
		int k;
		try {
		fis = new FileInputStream("C:\\Users\\ayush\\eclipse-workspace\\Learn\\src\\demo5.java");
		
		}
		
		catch (FileNotFoundException e) {
			System.out.println("File not found");
			
		}
		try {
		while((k = fis.read()) !=-1) {
			System.out.print((char)k);
		}
		}
		
		catch(NullPointerException e1) {
			System.out.println("File not found");
		}
		fis.close();

	}

}
