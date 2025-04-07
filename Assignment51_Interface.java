package assignments_List;

interface Shape
{
	
 abstract void getArea();
 abstract void getCircumference();
}

class Rectangle implements Shape
{

	@Override
	public void getArea() 
	{
		int a = 200;
		int b =  300;
		int area = a*b;
		System.out.println("The Area of circle is " +area);
	}

	@Override
	public void getCircumference()
	{
		System.out.println("Hellow");
	}
	
}
public class Assignment51_Interface extends Rectangle
{

	public static void main(String[] args) 
	
	{
		Assignment51_Interface a1 = new Assignment51_Interface();
		a1.getArea();
		a1.getCircumference();
	}

}
