package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortArray 
{
	public static void main(String[] args) 
	{
		
	int[] nums;
	nums=new int[6];
			nums[0]=10;
			nums[1]=14;
			nums[2]=23;
			nums[3]=32;
			nums[4]=16;
			Arrays.sort(nums);
			//System.out.println("Numbers are: "+nums);

			for(int i=0; i<nums.length;i++)
			{
				System.out.println("Numbers are: "+nums[i]);
			}
	
	}
}

/*static ArrayList<Integer> sortList(ArrayList list)
{
	Collections.sort(list);
	return list;
}
public static void main(String[] args) 
{
	ArrayList <Integer> alist=new ArrayList<>();
	alist.add(14);
	alist.add(10);
	alist.add(24);
	alist.add(33);
	alist.add(20);
	for(Integer i:alist)
	{
		System.out.println("Before sorting:"+i);
	}
	alist=sortList(alist);
	for(Integer i:alist)
	{
		System.out.println("After sorting: "+i);
	}
}*/
