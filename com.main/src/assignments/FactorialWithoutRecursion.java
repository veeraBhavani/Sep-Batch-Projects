package assignments;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialWithoutRecursion 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
	       System.out.print("Enter the number to find factorial : ");
	       int n = s.nextInt();
	       int result = factorial(n);
	       System.out.println("The factorial of " + n + " is " + result);
	}
    public static int factorial(int n) 
	   {
	       int result = 1;
	       for (int i = 1; i <= n; i++)
	       {
	           result = result * i;
	       }
	       return result;
	   }

}
