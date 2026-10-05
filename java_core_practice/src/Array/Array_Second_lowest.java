package Array;

public class Array_Second_lowest {

	public static void main(String[] args) {
		
		int [] arr = {10,20,33,40,38,94,90};
		
		int highest=0;
		
		int Shighest=0;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<highest)
			{
				Shighest=highest;
				highest=arr[i];
				
			}
			
			if(arr[i]<Shighest && arr[i]!= highest)
			{
				Shighest=arr[i];
			}
		}
		System.out.println(highest);
		System.out.println(Shighest);
		
		
		

	}

}
