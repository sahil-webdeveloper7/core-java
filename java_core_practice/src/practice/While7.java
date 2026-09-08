package practice;

public class While7 {

	public static void main(String[] args) {
		int num = 1;
		int counter = 1;
		int sum=0;
		
		while(counter<=98)
		{
			if(num%7==0 && num%8==0)
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
