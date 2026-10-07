package Nonprimitive;

public class Instance_variable {

	public static void main(String[] args) {
		
     Bank first =new Bank();
     
     first.name="SBI";
     first.amount=9908088;
     
     
     Bank Second =new Bank();
     
     Second.name="MGB";
     Second.amount=9002900;
     
 
     System.out.println(first.name);
     
     System.out.println(Second.name);
    

	}

}
class Bank
{
	String name;
	int amount;
}
