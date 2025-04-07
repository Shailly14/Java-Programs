package assignments_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Assignment92_Iterator
{

	public static void main(String[] args) 
	{
         Collection c = new ArrayList();
         c.add(200);
         c.add("Shailly");
         c.add(null);
         c.add(900);
         
         System.out.println("The list is " +c);
         Iterator itr = c.iterator();
         System.out.println("After iteration");
         {
        	 while (itr.hasNext())
        	 {
        		
        		System.out.println( itr.next());
        	 }
         }
	}

}
