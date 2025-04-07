package assignments_List;

class parentss
{
	final void insta()
	{
		System.out.println("login to insta");
	}
}
public class Assignment48_FinalMethodOverriding extends parentss
{ 
	void insta()
	{ 
		super.insta();
		System.out.println("login to fb");
	}

	public static void main(String[] args) 
	
	{
		Assignment48_FinalMethodOverriding a1 = new Assignment48_FinalMethodOverriding();
		a1.insta();
	}

}
