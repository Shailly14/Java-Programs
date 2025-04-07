package assignments_List;

class Amazon
{
	void username()
	{
		System.out.println("Login with user in parent");
	}
}

public class Assignment47_SuperKeywordProgram extends Amazon
{

	void username()
	{ 
		
		System.out.println("login with user in child");
		super.username();
	}
	public static void main(String[] args)
	{
		Assignment47_SuperKeywordProgram a1 = new Assignment47_SuperKeywordProgram();
		a1.username();

	}

}
