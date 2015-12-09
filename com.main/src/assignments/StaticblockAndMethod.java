package assignments;

public class StaticblockAndMethod 
{
	int rollno;  
    String name;  
    static String college = "ITS";  
      
    static void change()
    {  
    college = "SVU";  
    }  
 
    StaticblockAndMethod(int r, String n)
    {  
    rollno = r;  
    name = n;  
    }  
 
    void display ()
    {
    	System.out.println(rollno+" "+name+" "+college);
    }  
    static{  
    	  System.out.println("static block is invoked");   
    	  }  
   public static void main(String args[])
   {  
	   StaticblockAndMethod.change();  
 
	   StaticblockAndMethod s1 = new StaticblockAndMethod (111,"Bhavani");  
	   StaticblockAndMethod s2 = new StaticblockAndMethod (222,"Jyothi");  
	   StaticblockAndMethod s3 = new StaticblockAndMethod (333,"kamala");  
 
   s1.display();  
   s2.display();  
   s3.display();  
   }  	
		  
}        

