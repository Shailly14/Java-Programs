package assignments_List;

public class Assignment13_callnonstaticmethod
{
     static void add ()
     {
    	 int a = 20;
    	 int b = 30;
    	 System.out.println(a+b);
     }
     
     void mul()
     {
    	 int x= 30;
    	 int y = 22;
    	 System.out.println(x*y);
     }
	public static void main(String[] args) 
	{
          add();
          Assignment13_callnonstaticmethod a1 = new Assignment13_callnonstaticmethod();
          a1.mul();
	}

}
