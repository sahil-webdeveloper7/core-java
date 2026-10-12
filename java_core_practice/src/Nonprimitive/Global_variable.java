package Nonprimitive;

public class Global_variable {

	public static void main(String[] args) {
		
		City2 city=new City2();
		city.name="pune";
		city.Tax_collection();
		city.admintration();
	}

}
class City2
{
	String name;   // global 
	
	public void Tax_collection()
	{
		String name2="mumbai"; //local
		System.out.println(this.name+" "+name2);
	}
	public  void admintration()
	{
		System.out.println(this.name);
	}
	
}
