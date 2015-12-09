package assignments;

import java.io.File;

public class ListOfFileNames 
{
	public static void main(String args[])
	{
        File file = new File("C:\\Java files");
        String[] fileList = file.list();
        for(String name:fileList)
        {
            System.out.println(name);
        }
	 }
}
