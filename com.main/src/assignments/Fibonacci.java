package assignments;


	public class Fibonacci 
	{
		public static void main(String[] args) 
	      {
	            int fCount = 15;
		        int[] feb = new int[fCount];
		         feb[0] = 0;
		         feb[1] = 1;
		        for(int i=2; i < fCount; i++)
		         {
		             feb[i] = feb[i-1] + feb[i-2];
		         }
		 
		        for(int i=0; i< fCount; i++)
		        {
		                 System.out.print(feb[i] + " ");
		        }
	      }
		
		
     }

