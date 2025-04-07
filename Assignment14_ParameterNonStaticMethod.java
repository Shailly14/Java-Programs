package assignments_List;

public class Assignment14_ParameterNonStaticMethod
{
	void car(String model, int year)
	{
		System.out.println("The car model is " +model);
		System.out.println("The car year is " +year);
	}
	
	void person(String name, int age)
	{
		System.out.println("The person name is " +name);
		System.out.println("The person age is " +age);
	}
	void emp(String cname,double salary,float id)
	{
		System.out.println("The emp name is " +cname);
		System.out.println("The emp salary is " +salary);
		System.out.println("The emp id is " +id);
	}
	void bird(String color, String spices ) 
	{
		System.out.println(color);
		System.out.println(spices);
	}
	public static void main(String[] args) 
	{
		Assignment14_ParameterNonStaticMethod a1 = new Assignment14_ParameterNonStaticMethod();
		a1.car("HondaCity", 2022);
		a1.person("Shailly", 24);
		a1.emp("Salong", 23.22, 23);
		a1.bird("Blue", "Nightangle");
	}
	
}
