package Nonprimitive;

public class instance {

	public static void main(String[] args) {
		
		Laptop lappy = new Laptop();
		
		lappy.start();
		lappy.shutdown();
		
		Laptop lappy2 = new Laptop();
		
		lappy2.start();
		lappy2.shutdown();
		
        Laptop lappy3 = new Laptop();
		
		lappy3.start();
		lappy3.shutdown();


	}

}

class Laptop
{
	public void  start()
	{
		System.out.println("Start");
	}
	
	public void shutdown()
	{
		System.out.println("Shutdown");
	}
}
