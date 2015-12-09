package assignments;

import java.util.Scanner;

public class ScannerSumTwonums 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers to add");
		int x=s.nextInt();
		int y=s.nextInt();
		int z = x+y;
		System.out.println("The addition of two numbers: "+z);

	}

	

}
