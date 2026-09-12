package practice;

public class Prime_range5 {

	public static void main(String[] args) {
		
		int sum=0;
		int counter=1;
		
		for(int i=1;i<=789;i++)
		{
			if(i==2)
			{
				continue;
			}
			else
			{
				boolean flag = true;
				
				for(int j=2;j<=788;j++)
				{
					if(j%i==0)
					{
						flag=true;
						break;
						
					}
					
					if(flag)
					{
						counter++;
						sum=sum+i;
						
						System.out.println("Non Prime :"+i);
						
					}
					else
					{
					
						System.out.println("PRIME ::"+i);
					}
				}
			}
			System.out.println("Counter ::"+counter);
			System.out.println("Sum ::"+sum);
		}

	}

}
