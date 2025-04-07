package assignments_List;

public class Assignment16_MethodOverloading 
{
    void over()  //non static method
    {
    	System.out.println("Heloo First method");
    }
    
    static void over(int a, double b) //static method
    {
    	System.out.println("Hello Second methhod");
    	
    }
	public static void main(String[] args) 
	{
		Assignment16_MethodOverloading a1 = new Assignment16_MethodOverloading();
		a1.over();
		over(10,20.6); 
	}

}
