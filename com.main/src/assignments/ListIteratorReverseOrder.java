package assignments;

import java.util.LinkedList;
import java.util.List;

public class ListIteratorReverseOrder 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
	    List<String> list = new LinkedList<String>();
	    list.add("A");
	    list.add("B");
	    list.add("C");
	    list.add("D");

	    java.util.ListIterator<String> iter = list.listIterator(list.size());

	    while (((java.util.ListIterator<String>) iter).hasPrevious()) 
	    {
	      System.out.println(((java.util.ListIterator<String>) iter).previous());
	    }

	  }
}
