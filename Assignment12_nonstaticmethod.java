package assignments_List;

public class Assignment12_nonstaticmethod 
{
    int x = 200;
    int y = 50;
    
	void add()
	{
		int sum = x + y;
		System.out.println(sum);
	}
	
	void mul()
	{
		int multi = x*y;
		System.out.println(multi);
	}
	void div()
	{
		int divi = x/y;
		System.out.println(divi);
	}
	public static void main(String[] args) 
	{
		Assignment12_nonstaticmethod a1 = new Assignment12_nonstaticmethod();
		a1.add();
		a1.mul();
		a1.div();
	}

}
