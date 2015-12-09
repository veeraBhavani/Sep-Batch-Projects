package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOrder 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(120);
		list.add(135);
		list.add(145);
		list.add(155);
		list.add(165);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		for(Integer i:list)
		{
			System.out.println(i);
		}
	}

}
