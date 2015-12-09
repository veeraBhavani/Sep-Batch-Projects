package assignments;

public class LargestNumber 
{
   static int i;
	public static void main(String[] args)
	{
		int arr[]={12,14,16,17,18};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			 
		}
		
		System.out.println("largest value in array is " + max);
	}

}
