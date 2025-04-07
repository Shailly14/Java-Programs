package assignments_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Assignment95_ListIterator 
{

	public static void main(String[] args) 
	{
             List<Integer> itr = new ArrayList<Integer>();
             itr.add(100);
             itr.add(500);
             itr.addFirst(494);
             itr.addLast(6777);
             itr.add(2, 57);
             itr.add(9087);
             System.out.println("The list before itrator" +itr);
             
            ListIterator l1 = itr.listIterator();
            System.out.println("The Forward iterator");
            
            while(l1.hasNext())
            {
            	System.out.println(l1.next());
            }
           
            System.out.println("Backward iterator");
         while (l1.hasPrevious())
         {
        	 System.out.println(l1.previous());
         }
         System.out.println("After sorting");
             Collections.sort(itr);
             System.out.println(itr);
             
	}

}
