package practice;

public class Prime {

	public static void main(String[] args) {
		boolean flag=true;
		int number=29;
		for(int i=2;i<=28;i++) {
			if(number%i==0) {
				flag=true;
			}
		}
		
		if(!flag) {
			System.out.println("Prime");
		}
		else;
		{
			System.out.println("Composite");
		}

	}

}
