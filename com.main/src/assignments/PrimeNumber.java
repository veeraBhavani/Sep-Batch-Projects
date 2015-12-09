package assignments;

import java.util.Scanner;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		int temp;
		boolean isPrime = true;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number for check:");
		int num=s.nextInt();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		
		   }
		}
		if(isPrime)
	
		   System.out.println(num + " is Prime Number");
	
		else
		
		   System.out.println(num + " is not Prime Number");
	}
}
	


