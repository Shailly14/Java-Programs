package assignments_List;

class parents
{
	parents()
	{
     System.out.println("call this first");
	}
  
	parents(int a, double n)
	{
		this();
		System.out.println(" call it");
	}
}

public class Assignment45_thiscallingstatement extends parents

{
	Assignment45_thiscallingstatement()
	{
		System.out.println("call this second");
	}
	public static void main(String[] args) 
	{
		new Assignment45_thiscallingstatement();
	}

}
