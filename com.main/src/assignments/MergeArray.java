package assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArray 
{

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Bharti");
		list.add("Bhavani");
		list.add("103");
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("bhumika");
		list1.add("kamala");
		list.addAll(list1);
		
		for(String s: list)
		{
			System.out.println(s);
		}
		
		/*String a[] = { "A", "E", "I" };
		String b[] = { "O", "U" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(a));
	    list.addAll(Arrays.asList(b));
	   Object[] c = list.toArray();
	  System.out.println(Arrays.toString(c));*/
			   
			
	}

}
