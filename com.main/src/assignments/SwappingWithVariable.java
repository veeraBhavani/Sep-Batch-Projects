package assignments;

import java.util.Scanner;

public class SwappingWithVariable 
{

	public static void main(String[] args) 
	{
		 int x, y, temp;
	      System.out.println("Enter x and y");
	      Scanner obj = new Scanner(System.in);
	 
	      x = obj.nextInt();
	      y = obj.nextInt();
	 
	      System.out.println("Before Swapping\n x = "+x+"\n y = "+y);
	 
	      temp = x;
	      x = y;
	      y = temp;
	 
	      System.out.println("After Swapping\nx = "+x+"\ny = "+y);	

	}

}
