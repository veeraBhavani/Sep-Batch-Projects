package assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class HashMapKeyValues
{
	//private static HashMap<Integer, String> hmap1;

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");

	      for(Map.Entry m : hmap.entrySet())
			 {
				 System.out.println(m.getKey() + " " + m.getValue());
			 }
			 
			
			 
			Set<Integer> s = hmap.keySet();
			for(Integer i : s)
			{
				System.out.println(i);
			}
			 
			
			Collection<String> list = hmap.values();
			for(String s1 : list)
			{
				System.out.println(s1);
			}
			 
			System.out.println(hmap.get("105"));
			
	}
	
	}

