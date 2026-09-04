package practice;

public class For_loop1 {

	public static void main(String[] args) {
		int counter=0;
		int sum=0;
		
		for(int i = 1;i<=500;i++)   //for(Initialization,condition,operation) --> for((int i = 1);(i<=500);(i++))
		{
			System.out.println(i);
			counter++;
			sum=sum+i;
			
			}
		System.out.println("Counter :"+counter);
		System.out.println("Sum :"+sum);
		}

}
