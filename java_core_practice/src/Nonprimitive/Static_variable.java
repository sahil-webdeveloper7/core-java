package Nonprimitive;

public class Static_variable {

	public static void main(String[] args) {
		
		School.name="DPS";
		School.pincode=1001;
		
		System.out.println(School.name);
		
		
		School school1 = new School();   //creating object in static is a wrong method.it can be access directly without creating object
		school1.name="RMD";
		school1.pincode=4004;
		
		System.out.println(school1.name);
		System.out.println(School.name);
		
		
		
		School school2 = new School();
		school2.name="Poddar";
		school2.pincode=3003;
		
		
		System.out.println(school1.name);
		System.out.println(school2.name);
		System.out.println(School.name);
		
	
	}

}
class School
{
	static String name;
	static  int pincode ;
}
