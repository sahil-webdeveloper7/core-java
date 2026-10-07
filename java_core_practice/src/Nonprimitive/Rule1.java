package Nonprimitive;

public class Rule1 {

	public static void main(String[] args) {
		
		Earth india = new Earth();
		india.election();
		
		Earth America = new Earth();
		America.election();
		
		
		//static variable is shared or accessed in instance method 
		
		
		

	}

}
class Earth
{
	static String sun="Surya";
	
	public void election()
	{
		System.out.println("Election process : " + sun);
	}
	
}
