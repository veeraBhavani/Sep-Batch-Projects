package assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseStringArray 
{
	
		public static void main(String[] args) 
		{
		  String s = "Welcome";
		  System.out.println("First letter of Welcome is: "+ s.charAt(0));
		  System.out.println("Length of the Word Welcome is: "+s.length());
		  System.out.println(s);
		 for(int i=s.length()-1;i>=0;i--)
		 	{
			 System.out.print(s.charAt(i));
		 	}
         }
}



/*class ReverseStringArray
{
   public static void main(String args[])
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter a string to reverse it: ");
	   String original = s.nextLine();
      StringBuffer a = new StringBuffer(original);
      System.out.println(a.reverse());
   }
}*/