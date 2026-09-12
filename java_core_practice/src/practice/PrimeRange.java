package practice;

public class PrimeRange {

	public static void main(String[] args) {
		boolean flag = false;
		int sum=0;
		int counter=0;
		
		
		for(int i =2;i<=500;i++)
		{
			if(i==2)
			{
				continue;
				
			}
			else
			{
				int number=i;
				for(int j=2;j<=i;j++) {
					if(j%i==0) {
						flag=true;
						break;
					}
				}
				
				if(flag) {
					counter++;
					sum=sum+number;
					System.out.println("Non Prime"+i);
				}
				else;
				{
					System.out.println("Prime"+i);
				}
			}
			
			
			
			
			

			
		}
		System.out.println("Sum : "+sum);
		System.out.println("Counter : "+counter);
	}

}
