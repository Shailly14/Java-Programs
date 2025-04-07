package assignments_List;

public class Assignment70_String_EqualFun 
{

	public static void main(String[] args) 
	{
     String name = "Shailly";
     String name1 = "shailly";
    	Boolean check =	 name.equals(name1);
    	System.out.println("The two string is equal " +check);
    	Boolean check1 = name.equalsIgnoreCase(name1);
    	System.out.println(" The two string is equal or not " +check1);
    	
	}

}
