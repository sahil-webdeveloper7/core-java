package practice;

public class Whileloop2 {

	public static void main(String[] args) {
		
		int num =1;
		int counter=0;
		int sum=0;
		
		while(num<=50)
		{
			System.out.println(num);
			sum=sum+num;
			counter++;
			num++;
			
			
		}
		System.out.println(counter);
		System.out.println(sum);

	}

}
