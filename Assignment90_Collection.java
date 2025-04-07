package assignments_List;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment90_Collection 
{

	public static void main(String[] args) 
	{
          Collection b   =  new ArrayList(); //upcasting
          b.add(200);
          b.add(100);
          b.add(898);
          b.add("Shailly");
          b.add(null);
          b.add('B');
         
          System.out.println("The array list is " +b);
          
        
          
           Collection c = new ArrayList();
          c.add(101);
          c.add(505);
          c.addAll(b);
          System.out.println(" The list after adding b to c" +c);
        
          c.remove(101);
          System.out.println("The list after removing " +c);
          
       boolean b3=   b.contains(200);
          System.out.println("The list contain " +b3);
          
         boolean b1 = b.isEmpty(); //
         System.out.println("The list is empty or not " +b1);
         
         
          
	}

}
