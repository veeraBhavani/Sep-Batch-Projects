package assignments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashSet 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(101,"Bharti");
		hm.put(102,"Bhavani");
		hm.put(103,"Jyothi");
		hm.put(104,"bhumika");
		hm.put(105,"kamala");
		System.out.println(hm);
		//If you want to get both
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//If you want to get only keys
		Set<Integer> s=hm.keySet();
		for(Integer i: s)
		{
			System.out.println(i);
		}
		//if u want to get only values
		Collection<String> s1=hm.values();
		for(String j: s1)
		{
			System.out.println(j);
		}
	}

	public boolean add(String arrayElement) {
		// TODO Auto-generated method stub
		return false;
	}

}
