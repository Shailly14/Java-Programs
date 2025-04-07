package assignments_List;

public class Assignment10_andwithNot {

	public static void main(String[] args) 
	
	{
        int a = 100;
        int b = 200;
        if (a==b && b == 200) //AND operator
        {
        	System.out.println("print hello");
        }
        if (a==100 || b >200) // OR operator
        {
        	System.out.println("Print hello 1");
        }
        if (!(a>100 && b >=100))
        {
        	System.out.println("Print hello 3");
        }
        if (!(a<100 || b >200))
        {
        	System.out.println("Print hello 5");
        }
	}

}
