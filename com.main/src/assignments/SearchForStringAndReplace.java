package assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class SearchForStringAndReplace 
{
	/*public static void main(String[] args) throws IOException 
	{
		
	File log= new File("C:\\Innova class files\\OutPut1.txt");
    String search = "Bhavani";
    String replace = "VeeraBhavani";
    FileReader fr = new FileReader(log);
    String s;
    String totalStr = "";
    try (BufferedReader br = new BufferedReader(fr)) 
    {

        while ((s = br.readLine()) != null)
        {
        	totalStr += s;
         }
        totalStr = totalStr.replaceAll(search, replace);
        FileWriter fw = new FileWriter(log);
    fw.write(totalStr);
    fw.close();
    }

	catch(Exception e)
	{
    e.printStackTrace();
    }*/

    	 
        public static void main(String[] args) throws IOException {
            String str;
     
            // Read properties file.
            Properties properties = new Properties();
            properties.load(new FileReader("file.properties"));
     
            // reader
            String strTest = readFile("OutPut1.txt");
     
            // writer
            BufferedWriter bw = new BufferedWriter(new FileWriter("resultFile.txt"));
     
            // for each property key, replace all occurrences with appropriate
            // element.
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String keyName = (String) key;
                System.out.println("keyName = " + keyName);
                String value = (String) properties.get(key);
                System.out.println("value = " + value);
     
                System.out.println("reading....\n" + strTest + "\n");
                int x = 0;
                int y = 0;
                StringBuilder result = new StringBuilder();
                while ((x = strTest.indexOf(keyName, y)) > -1) {
                    result.append(strTest, y, x);
                    result.append(value);
                    y = x + keyName.length();
                }
     
                result.append(strTest, y, strTest.length());
                str = result.toString();
     
                if (str.indexOf("'',") != -1) {
                    continue;
                } else {
                    str = str + "\n";
                    // write result to destination file.
                    bw.write(str);
                }
     
            }
            bw.write(strTest);
            // must close file when done.
            bw.close();
     
        } // end of main.
     
        public static String readFile(String file) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            StringBuilder stringBuilder = new StringBuilder();
            String ls = System.getProperty("line.separator");
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            return stringBuilder.toString();
        }
    
	}

    

