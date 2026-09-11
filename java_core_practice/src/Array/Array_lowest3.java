package Array;

public class Array_lowest3 {

	public static void main(String[] args) {
		
		int[] num= {-10290,-2802,-29830,-39802,-99020,-28893,-927993,-2930380,-9893279};
		
		int highest=0;
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<highest)
			{
				highest=num[i];
			}
		}
		System.out.println(highest);
	}

}
