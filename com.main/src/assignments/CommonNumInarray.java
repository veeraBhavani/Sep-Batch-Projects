package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CommonNumInarray 
{

	public static void main(String[] args)
    {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(12);
		list1.add(21);
		list1.add(15);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(15);
		list2.add(51);
		list2.add(12);
		
		//list1.addAll(list2);
		
		list1.retainAll(list2);
		 
		for(Integer i: list1)
		{
			System.out.println(i);
		}
		
		
        /*Integer[] i1 = {1, 2, 3, 4, 5, 4};
 
        Integer[] i2 = {3, 4, 5, 6, 7, 4};
 
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));
 
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));
 
        set1.retainAll(set2);
 
        System.out.println(set1);    
         */
    }
	

}
