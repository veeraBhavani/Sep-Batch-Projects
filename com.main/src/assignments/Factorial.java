package assignments;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter the number:");
	      int num = s.nextInt();
	      int factorial = fact(num);
	      System.out.println("Factorial of number  "+num+" "+"is: "+factorial);
	   }
	   static int fact(int n)
	   {
	       int output;
	       if(n==1)
	       {
	         return 1;
	       }
	       //Recursion: Function calling itself!!
	       output = fact(n-1)* n;
	       return output;
	}

}
