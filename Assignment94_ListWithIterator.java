package assignments_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment94_ListWithIterator 
{

	public static void main(String[] args) 
	{
      List l1   = new ArrayList();
      {
    	  l1.add(100);
    	  l1.add("shailly");
    	  l1.add('Z');
    	  l1.add(300);
    	  l1.add(null);
    	  l1.add("saini");
    	  System.out.println("Before iteration" +l1);
      
	 	Iterator itr =l1.iterator();
	 	System.out.println("After Iteration");
	 	{
	 	 while (itr.hasNext())
	 	 {
	 		 System.out.println( itr.next());
	 	 }
      }}
	}

}
