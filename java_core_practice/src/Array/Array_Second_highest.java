package Array;

public class Array_Second_highest {
	
	int[] num= {20,3000,283400,273940,48703,874993,298873093,928903903,8993};
	
	int lowest=0;
	
	int slowest=0;
	
	
	for(int i=0;i<num.length;i++)
		
	{
		if(num[i]>lowest)
		{
			slowest=lowest;
			lowest=num[i];
			
		}
		if(num[i]>slowest && num[i]!=lowest)
		{
			slowest=num[i];
			
		}
	}
	System.out.println(lowest);
	System.out.println(slowest);
		
	

	
	

}
}
