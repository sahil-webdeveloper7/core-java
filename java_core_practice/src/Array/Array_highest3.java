package Array;

public class Array_highest3 {

	public static void main(String[] args) {
		
		int[] num= {20,3000,283400,273940,48703,874993,298873093,928903903,8993};
		
		int lowest=0;
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>lowest)
			{
				lowest=num[i];
			}
		}
		System.out.println(lowest);
		
		
		
		

	}

}
