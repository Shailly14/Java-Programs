package assignments_List;

public class Assignment68_String_Functions
{

	public static void main(String[] args)
	{

		 String name = "Shailly";
		  int input = name.length(); //Return the lenth of the string
		  System.out.println("The length of the string is " +input);
		  
		    String input1 =name.toLowerCase(); // return lower case
		    System.out.println("The lower case of the string is " +input1);
		    
		    String input2=name.toUpperCase(); // Return upper case
		    System.out.println("The upper case of the string is " +input2);
		    
		    String name1 = " SHAilly ";
		   String input3= name1.trim(); // trim start and end space
		   System.out.println("The trim of the string is " +input3);
		   
		  char input4= name.charAt(3); // return given index char
		  System.out.println("The index position of string " +input4);
	}

}
