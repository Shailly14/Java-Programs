package assignments_List;

abstract class Birdy
{
	abstract void fly();
	
	
}

 class Animal1 extends Birdy
{

	
	 void fly()
	{
		System.out.println("Bird can flying high");

	}
		
}
	

public class Assignemment50_AC_CM extends Animal1
{

	public static void main(String[] args)
	{
		Assignemment50_AC_CM a1 = new Assignemment50_AC_CM();
	  a1.fly();
	    
	}
	
}