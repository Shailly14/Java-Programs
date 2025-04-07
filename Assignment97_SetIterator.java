package assignments_List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment97_SetIterator 
{

	public static void main(String[] args) 
	{
        Set <String> s11 = new HashSet<String>();
        s11.add("Shailly");
        s11.add("Dolly");
        s11.add("True");
        s11.add("Hello");
        System.out.println("The list is " +s11);
        
      boolean b1 =  s11.isEmpty();
      System.out.println("Whether list is empty or not " +b1);
      
     Iterator l1= s11.iterator();
     System.out.println("After iterator");
     while(l1.hasNext())
     {
    	 System.out.println(l1.next());
     }
     
	}

}
