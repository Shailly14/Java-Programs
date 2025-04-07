package assignments_List;

class Parents
{
	int a = 10;
	int b = 20;
	void add()
	{
		System.out.println(a*b);
	}
}
public class Assignment_39_Inheritance extends Parents
{

	public static void main(String[] args) 
	{
		Assignment_39_Inheritance a1 = new Assignment_39_Inheritance();
		a1.add();
	}

}
