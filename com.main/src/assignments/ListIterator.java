package assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIterator 
{
	 public static void main(String a[])
	 {
	        ArrayList<String> arrl = new ArrayList<String>();
	        arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
	        Iterator<String> itr = arrl.iterator();
	        while(itr.hasNext())
	        {
	            System.out.println(itr.next());
	        }
	    }
	}

