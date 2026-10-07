package Nonprimitive;

public class Static_method {

	public static void main(String[] args) {
		
		Mobile.start();
		Mobile.switchoff();

	}

}
class Mobile
{
	public static void start()
	{
		System.out.println("Start");
	}
	public static void switchoff()
	{
		System.out.println("Switchoff");
	}
}
