package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Bharti");
		list.add("Bhavani");
		list.add("103");
		list.add("bhumika");
		list.add("kamala");
		
		//ArrayList<String> list=new ArrayList<string>();
		//Iterator<String> it=list.iterator();
		ListIterator<String> it=list.listIterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		System.out.println(" ");
		while(it.hasPrevious())
		{
		System.out.println(it.previous());
		}
	}

}
