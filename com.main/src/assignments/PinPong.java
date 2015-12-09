package assignments;

import java.util.Scanner;

public class PinPong 
{

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int i=obj.nextInt();
		
		if (i % 3 == 0 && i % 5 == 0) 
		{
            System.out.println("pingpong");
        } 
        else if (i % 5== 0)
        {
           System.out.println("pong"); 
        }
        else if (i % 3 == 0 )
        {
            System.out.println("ping");
        }
        else
        {
        	System.out.println(i);
        }
       
		
	}
	

}
