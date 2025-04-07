package assignments_List;

 class superparents
{
	superparents(int a, String name)
{
	System.out.println("Hellow to parent super statementt");
 
}
}
public class Assignment44_superParamethod extends superparents
{
	Assignment44_superParamethod()
	{
		super(10,"Hllo");
		System.out.println(" Hellow to child");
	
	}
	public static void main(String[] args)
	{
          new Assignment44_superParamethod();
	}

}
