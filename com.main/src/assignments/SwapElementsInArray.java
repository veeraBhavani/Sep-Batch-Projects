package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class SwapElementsInArray
{
	static ArrayList<Integer> sortList(ArrayList<Integer> list)
	{
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=0;j<list.size();j++)
			{
				if(list.get(i)>list.get(j))
				{
					int temp=list.get(i);
					list.set(i,list.get(j));
					list.set(j, temp);
				}
			}
		}
		return list;
	}
	
	/*static void accessElements(ArrayList<Integer> list)
	{
		Collections.sort(list);
		//return list;
	ListIterator <Integer> it=list.listIterator();
	while(it.hasNext())
	{
	System.out.println(it.next());
	}
	System.out.println(" ");
	while(it.hasPrevious())
	{
	System.out.println(it.previous());
	}
	}*/
	
public static void main(String[] args) 
{
	ArrayList <Integer> alist=new ArrayList<Integer>();
	alist.add(14);
	alist.add(10);
	alist.add(24);
	alist.add(33);
	alist.add(20);
	
	for(Integer i:alist)
	{
		System.out.println("Before sorting:"+i);
		System.out.println(" ");
	}
	alist=sortList(alist); 
	for(Integer i:alist)
	{
		System.out.println("After sorting and swapping 2 elements Descending order: "+i);
	}
	
}
}
		


