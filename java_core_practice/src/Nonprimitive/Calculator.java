package Nonprimitive;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator1 cal =new Calculator1();
		
		int num =cal.add(30,80);
	
		int num1 = cal.sub(50,40);

	}
	

}
class Calculator1
{
	public int add(int x,int y)

	{
		return x+y;
	}

	public int sub(int x, int y)
	{
		return x-y;
		
	}
}


