package assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class CopyContentFileToFile 
{
	
	static void copyData()
	{
		FileOutputStream out1 = null;
		FileInputStream in1 = null;
		FileInputStream in2 = null;
		SequenceInputStream sis = null;
		try {
			in1 = new FileInputStream(new File("C:\\Innova class files\\ReadFromConsole.txt"));
			in2 = new FileInputStream(new File("C:\\Innova class files\\FileInput.txt"));
			 sis = new SequenceInputStream(in1,in2);
			out1 = new FileOutputStream(new File("C:\\Innova class files\\OutPut1.txt"));
			int i;
			while((i=sis.read()) != -1)
			{
				out1.write(i);
			}
			System.out.println("success");
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		finally
		{
			try {
				in1.close();
			//	in2.flush();
				out1.close();
				out1.flush();
				in2.close();
				sis.close();
				//out2.flush();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) 
	{
		CopyContentFileToFile .writeToMultipleFiles();

}
	private static void writeToMultipleFiles() {
		// TODO Auto-generated method stub
		
	}
}
