package Array;

public class Array_highest2 {

	public static void main(String[] args) {
		int arr[]= {-3,-4,-5,-6,-8,};
		
		int lowest = Integer.MIN_VALUE;
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>lowest)
			{
				lowest=arr[i];
			}
			
		}
		System.out.println(lowest);

	}

}
