package Array;

public class Array_lowest {

	public static void main(String[] args) {
		int[] arr= {13,11,30,2,89,70,29};
		int highest = 1000;
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
