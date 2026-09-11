package Array;

public class Array_lowest2 {

	public static void main(String[] args) {
		
		int[] arr= {100003,300002,300487,74882,8367893,2837,292793};
		
		int highest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<highest)
			{
				highest=arr[i];
			}
		}
		System.out.println(highest);

	}

}
