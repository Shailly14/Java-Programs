package assignments_List;

public class Assignment18_Constructor
{
	Assignment18_Constructor(int a, double b)  //constructor
	{
		
		System.out.println("Hello");
		
	}
	
	Assignment18_Constructor(char a, boolean b) // parameter 
	{
		System.out.println("Hello 2");
	}
	
	Assignment18_Constructor() // non parameter
	{
		System.out.println("Hello 3");
	}
 public static void main(String[] args)
 {
	 new Assignment18_Constructor(10,33.6);
	 Assignment18_Constructor a1 = new Assignment18_Constructor('F',false);
	 new Assignment18_Constructor();
 }
}
