package assignments_List;

public class Assignment3_callstaticmethod_mainmethod {

	static void add() //static method outside the main method method name is add
	{
		int a= 10; 
		int b = 20;
		int sum = a+b;
		System.out.println(sum);
	}
	
	static void mul() //static method outside the main method
	{
		int a= 10; 
		int b = 20;
		int multiple = a*b;
		System.out.println(multiple);
	}
	static void div() //method name is div
	{
		float x = 100;
		int y = 200;
		float divide = x/y;
		System.out.println(divide);
	}
	static void sub()
	{
	    int p = 400;
		int q = 300;
		int subs = q-p;
		System.out.println(subs);
	}	
	public static void main(String[] args) 
	{
		add(); //calling static method by its method name
		mul();
		div();
		sub();
		
	}

}
