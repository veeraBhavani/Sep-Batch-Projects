package assignments;

public class ReplaceSubstring 
{
			
		public static void main(String[] args) 
		 {
			String s = "Welcome";
			System.out.println("string is " +s);
			String substr = s.substring(3,6);
			 System.out.println("substring is " + substr);
			  s = s.replace("come", "go");
			 //System.out.println(s.replace("come", "go"));
			 System.out.println("In welcome, Come is replaced by go: "+s);
			 
			}


}
