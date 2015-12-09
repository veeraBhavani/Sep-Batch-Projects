package assignments;

import java.util.Scanner;

public class PingPong1 {

	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int i=obj.nextInt();
		for (i=1; i <= 100; i++){

		    if( i % 3 == 0 ){
		    	System.out.println("ping");
		        continue;
		    }
		    if( i % 5 == 0 ){
		    	System.out.println("pong");
		        continue;
		    }

		    System.out.println(i);
		}
	}

}
