package assignments;

import java.util.TreeSet;

public class DuplicatesInArray 
{
	public static void main(String[] args) 
	{
		 String[] strArr = {"Bhavani", " Sravya", "Bharti", "Nitya", "Bharti", "Reena"};

       TreeSet<String> unique = new TreeSet<String>();
        for(String str:strArr)
        {
            if(!unique.add(str))
            {
                System.out.println("Duplicate Entry is: "+str);
            }
        }
    }	
	
}
