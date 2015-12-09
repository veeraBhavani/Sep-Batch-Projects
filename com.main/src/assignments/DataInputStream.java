package assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStream 
{      
	static void readFile(String path)
	{
		FileInputStream in;
		try 
		{
			 in = new FileInputStream("C:\\Innova class files\\FileInput.txt");
			 int i;
			 while((i=in.read()) != -1)
			 {
				
				 System.out.print((char)i);
			 }
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		 catch (IOException e) 
		{
				e.printStackTrace();
		}
	}
		public static void main(String[] args) 
		{
			
			String path="C:\\Innova class files\\FileInput.txt";
			DataInputStream.readFile(path);
		}
	

}

