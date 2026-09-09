package Array;

public class Array_highest {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,67,89,35};
		
		int lowest = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>lowest)
			{
				lowest=arr[i];
				
			}
		}
		System.out.println(lowest);
	}

}
