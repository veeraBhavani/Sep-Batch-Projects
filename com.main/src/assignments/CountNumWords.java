package assignments;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountNumWords 
{
	public static void main(String args[])
	{ 
		CountNumWords s=new CountNumWords(); 
		try 
		{ 
			s.start(); 
		} 
		catch(Exception e) 
		{ 
			System.out.print("Some problem occured"); 
		} 
		}
	public void start() throws Exception 
	{
		FileReader fr=null; 
		BufferedReader br=null; 
		try 
		{
			fr=new FileReader("C:\\Innova class files\\ReadFromConsole.txt"); 
			br=new BufferedReader(fr); 
			String line=br.readLine(); 
			int totword=0; 
			while(line!=null) 
			{ 
				String a[]=line.split(" "); 
				for(int i=0;i<a.length;i++) 
				{ 
					if(a[i].length()>0) 
						totword+=1; 
				} 
				line=br.readLine(); 
				} 
			System.out.print("Total number of words in a file: "+totword); 
			br.close(); 
			} 
		catch(Exception e) 
		{ 
			e.printStackTrace(); 
			System.out.println("error"+e.getMessage()); 
		} 
		finally 
		{ 
			br.close(); 
			fr.close(); 
			} 
		
	}

	
}
