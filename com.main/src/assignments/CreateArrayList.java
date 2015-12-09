package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CreateArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(1004);
		list1.add(99);
		list1.add(1230);
		list1.add(1);
		System.out.println(list1);
		//get elemets 
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
        //To search for an element
        
        LinkedList<String> lList = new LinkedList<String>();
	      lList.add("1");
	      lList.add("2");
	      lList.add("3");
	      lList.add("4");
	      lList.add("5");
	      lList.add("2");
	      System.out.println("First index of 2 is:"+
	      lList.indexOf("2"));
	      System.out.println("Last index of 2 is:"+ 
	      lList.lastIndexOf("2"));
	      
		//print elements Reverse order using iterator
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
