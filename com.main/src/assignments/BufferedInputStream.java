package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedInputStream 
{

    public static void main(String[]args) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	System.out.println("Enter 1st number: ");
    	String str1 = br.readLine();
    	int x = Integer.parseInt(str1);

    	System.out.println("Enter second number: ");
    	String str2 = br.readLine();
    	int y = Integer.parseInt(str2);

        int z=x+y;
        int s=x-y;
        
       System.out.println("Total Addition: "+z);
       System.out.println("After Subtraction: "+s);
    }
}
       