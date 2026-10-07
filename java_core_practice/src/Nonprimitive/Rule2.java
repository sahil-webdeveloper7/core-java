package Nonprimitive;

public class Rule2 {

	public static void main(String[] args) {
		
		Earth india = new Earth();
		india.river="Godavari";
		
		Earth America = new Earth();
		America.river="missisipi";
		
		
		

	}

}
class Earth
{
	String river;
	
	public static void rain()
	{
		System.out.println("It is raining" + rain); // instance variable is not accessed or shared for a static method because static method does not make copies
	}
	
}
