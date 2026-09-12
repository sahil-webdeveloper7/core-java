package practice;

public class Prime2 {

	public static void main(String[] args) {
		int sum=0;
		int counter=1;
		for(int i=1;i<1000;i++)
		{
			if(i==2)
			{
				continue;
			}
			else
			{
				boolean flag = true;
				int number =i;
				for(int j=2;j<=999;j++)
				{
					if(j%i==0)
					{
						flag = true;
						break;
					}
					
					if(flag)
					{
						counter++;
						sum=sum+i;
						
						System.out.println("Non prime:"+i);
					}
					else
					{
						
						System.out.println("PRIME:"+i);
						
					}
				}
			}
			
		}
		System.out.println("Counter :"+counter);
		System.out.println("Sum :"+sum);

	}

}
