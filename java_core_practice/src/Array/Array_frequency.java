package Array;

public class Array_frequency {

	public static void main(String[] args) {
		
		int [] arr= {1,1,2,2,3,3,3,3,4,4,4,4};
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			int counter=0;
			for(int j=0;j<arr.length;j++)
			{
				if(num==arr[j])
				{
					counter++;
				}
				
			}
			System.out.println(arr[i]+":"+counter);
		}

	}

}
