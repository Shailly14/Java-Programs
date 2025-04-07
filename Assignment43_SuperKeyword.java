package assignments_List;

class superparent
{
	superparent()
	{
		System.out.println("Parent super key");
	}
}
public class Assignment43_SuperKeyword extends superparent
{
	Assignment43_SuperKeyword()
	{
	
		super();
	
		System.out.println("Hello super key");
	}

	
	
	public static void main(String[] args) 
	{
		new Assignment43_SuperKeyword();
		
	}

}

