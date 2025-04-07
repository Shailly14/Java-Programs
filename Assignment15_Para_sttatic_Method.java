package assignments_List;

public class Assignment15_Para_sttatic_Method 
{
    static void bird(int age, String color) 
    {
    	System.out.println("The bird age is " +age);
    	System.out.println("The bird colod is " +color);
    }
    static void animal(int age, String name, char gender)
    {
    	System.out.println("The animal age is " +age);
    	System.out.println("The animal name is" +name);
    	System.out.println("The animal gender is " +gender);
    }
	public static void main(String[] args)
	{
		bird(10,"Peacock");
		animal(10,"Tiger",'M');
	}

}
