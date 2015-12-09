	package assignments;
	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.LinkedHashSet;
	import java.util.TreeSet;

	public class BharathiSet
	{

		public static void main(String[] args) 
		{
			//HashSet<String> myset=new HashSet<>();
			/*myset.add("Bharti");
			myset.add("Bhavani");
			myset.add("Bhagya");
			myset.add("Bhargavi");
			myset.add("Bhavya");
			myset.add("Bhumika");
			myset.add("Bhagya");
			myset.add(null);
			myset.add(null);*/
			/*for(String s:myset)
			{
				System.out.println(s);
			}*/
			/*Iterator<String> it= myset.iterator();
			while(it.hasNext())
			{
			System.out.println(it.next());
			}*/
			/*ArrayList<String> list=new ArrayList<String>();
			HashSet<String> myset=new HashSet<>();
			list.add("Bhavani");
			list.add("Bhagya");
			list.add("Bhargavi");
			list.add("Bhavya");
			list.add("Bhumika");
			list.add("Bhagya");
			list.add(null);
			list.add(null);
			for(String s : list)
			{
			System.out.println("Before :" +s);
			}
			System.out.println(" ");
			myset.addAll(list);
			System.out.println("Im myset: "+myset);
			//list.clear();
			//list.addAll(myset);
			for(String m : myset)
			{
			System.out.println(m);
			}*/
			/*LinkedHashSet<String> myset=new LinkedHashSet<>();
			myset.add("Bharti");
			myset.add("Bhavani");
			myset.add("Bhagya");
			myset.add("Bhargavi");
			myset.add("Bhavya");
			myset.add("Bhumika");
			myset.add("Bhagya");
			myset.add(null);
			myset.add(null);
			for(String m : myset)
			{
			System.out.println(m);*/
			TreeSet<String> myset=new TreeSet<>();
			myset.add("Bharti");
			myset.add("Bhavani");
			myset.add("Bhagya");
			myset.add("Bhargavi");
			myset.add("Bhavya");
			myset.add("Bhumika");
			myset.add("Bhagya");
				
			for(String m : myset)
			{
			System.out.println(m);
			}
		}

	}


