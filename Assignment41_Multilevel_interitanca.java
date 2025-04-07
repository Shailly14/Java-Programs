package assignments_List;

class person
{
	void display(String name, int age)
	{
		System.out.println("the person name is " +name);
		System.out.println("the person age is" +age);
	}
}
class Employee extends person
{
	static void display(String name, int age,double salary)
	{
		System.out.println("The emp name is " +name);
		System.out.println("The emp age is " +age);
		System.out.println("The emp salary is " +salary);
	}
}
 

public class Assignment41_Multilevel_interitanca extends Employee
{
			// TODO Auto-generated method stub
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 30;
		 System.out.println("Hello");

		Assignment41_Multilevel_interitanca a1 = new Assignment41_Multilevel_interitanca();
		a1.display("shiana", 8);
	
       display("Shailly",28,2346.55);
       
	} 
       
}
	
