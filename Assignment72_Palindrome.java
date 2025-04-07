package assignments_List;

public class Assignment72_Palindrome 
{

	public static void main(String[] args) 
	{

		String name = "level";
		String name1 ="";
		for (int i = name.length()-1;i >=0; i--)
		{
			char a= name.charAt(i);
			name1 = name1+a;

			System.out.println(name1);
		}
   
		if(name.equals(name1))
		{
			System.out.println(" The string is palindrom");
		}
		
		else
		{
			System.out.println("STring is not palindrom");
		}
	}

}
