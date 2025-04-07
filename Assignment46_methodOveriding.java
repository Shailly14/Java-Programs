package assignments_List;

class ParentChild
{
	void login()
	{
		System.out.println("Login to parent days");
	}
}

public class Assignment46_methodOveriding extends ParentChild
{
   
	void login()
	{
		System.out.println("Login to System");
	}
	public static void main(String[] args) 
	{
		Assignment46_methodOveriding a1 = new Assignment46_methodOveriding();
		a1. login();
	}

}
