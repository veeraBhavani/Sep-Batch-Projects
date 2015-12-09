package assignments;

import java.util.ArrayList;

public class CopyArrayListToArray 
{
	public static void main(String[] args)
	{
	ArrayList<String> arr1=new ArrayList<String>();
	arr1.add("SaiRam");
	arr1.add("Shiva");
	arr1.add("Vishnu");
	arr1.add("Maheswaraha");
	System.out.println("Actual ArrayList: "+arr1);
	String[] strArr= new String[arr1.size()];
	arr1.toArray(strArr);
	//System.out.println(strArray.length());
	System.out.println("Created Array content:");
	
    for(String str:strArr)
    {
        System.out.println(str);
    }


	 }
}
