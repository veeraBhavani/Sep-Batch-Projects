package assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import Innova.FileIO;

public class ReadFromConsole 
{
	public static void writeFileWrite(String path)
	{
		FileWriter out = null;
		BufferedWriter bout = null;
		try {
			 out = new FileWriter(new File("C:\\Innova class files\\ReadFromConsole.txt"));
			 bout = new BufferedWriter(out);
			 String s = " We are writing into the file";
			 bout.write(s);
			 System.out.println("Success");
			 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				bout.close();
				out.close();
				
				//out.flush();
				//bout.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	static void readFromConsole()
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		//Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name;
		try {
			name = br.readLine();
			System.out.println("My name is " + name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public static void main(String[] args) {
	String path = "C:\\Innova class files\\ReadFromConsole.txt";
	ReadFromConsole.writeFileWrite("C:\\Innova class files\\ReadFromConsole.txt");
	ReadFromConsole.readFromConsole();
	
}
}

