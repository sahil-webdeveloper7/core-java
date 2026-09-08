package practice;

public class While5 {

	public static void main(String[] args) {
		int num = 1;
		int counter = 1;
		int sum=0;
		
		while(counter<=88)
		{
			if(num%3==0)
			{
				System.out.println(num);
				counter++;
				sum=sum+num;
				
			}
			num++;
		}
		System.out.println(sum);
		


	}
	
}
