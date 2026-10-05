package Nonprimitive;

public class Class1 {

	public static void main(String[] args) {
		
		
		Student first = new Student();
		
		first.name="Sahil";
		first.gender='M';
		first.rollnumber=21;
		first.mobilenumber="93592434306";
		
		first.name="Jay";
		
		
		
		System.out.println(first.name);
		System.out.println(first.mobilenumber);
		System.out.println(first.rollnumber);
		System.out.println(first.gender);
		
		System.out.println("----------------------------------");
		
		Student second = new Student();
		
		second.name="Parth";
		second.gender='M';
		second.rollnumber=9;
		second.mobilenumber="9359004306";
		
		
		System.out.println(second.name);
		System.out.println(second.mobilenumber);
		System.out.println(second.rollnumber);
		System.out.println(second.gender);
		
		System.out.println("-----------------------------------");
		
        Student third = new Student();
		
		third.name="Abhijeet";
		third.gender='M';
		third.rollnumber=7;
		third.mobilenumber="9359009988";
		
		
		System.out.println(third.name);
		System.out.println(third.mobilenumber);
		System.out.println(third.rollnumber);
		System.out.println(third.gender);
		
		System.out.println("-----------------------------");
		
		Bike royalenfield = new Bike();
		
		royalenfield.name="Hunter";
		royalenfield.color="Grey";
		royalenfield.average="35km/ltr";
		royalenfield.cc=350;
		
		System.out.println(royalenfield.name);
		System.out.println(royalenfield.color);
		System.out.println(royalenfield.cc);
		System.out.println(royalenfield.average);
		

	}
	
}
class Student
{
	String name;
	String mobilenumber;
	int rollnumber;
	char gender;
}

class Bike
{
	String name;
	String color;
	String average;
	int cc;
	
}

