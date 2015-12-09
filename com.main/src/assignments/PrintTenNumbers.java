package assignments;

import java.util.Arrays;

public class PrintTenNumbers 
{
	public static void main(String[] args) 
	{
	    Object[] numbers = new Object[10];
	    Arrays.fill(numbers, new Object() 
	    {
	        private int count = 0;
	        @Override
	        public String toString() 
	        {
	            return Integer.toString(++count);
	        }
	    });
	    System.out.println(Arrays.toString(numbers));
	}
}
