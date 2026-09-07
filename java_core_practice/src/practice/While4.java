package practice;

public class While4 {

	public static void main(String[] args) {
		int num = 1;
		int counter=0;
		int sum = 0;
		
		while(counter<50)
		{
			if(num%2==0)
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
