package assignments_List;

import java.util.ArrayList;
import java.util.List;

public class Assignment93_ListMetthods 
{

	public static void main(String[] args)
	
	{

    List <Integer> l = new ArrayList();
    {
    	l.add(1000);
    	l.add(200);
    	l.add(0, 909);
    	l.addFirst(209);
    	l.addLast(987);
    	System.out.println("The  interger list is " +l);
    	
    }
    
    List<String> l1 = new ArrayList();
    {
    	l1.add("Shailly");
    	l1.add("How Are you");
    	l1.add(0, "Hi");
    	l1.addFirst("Hello");
    	l1.addLast("?");
    	System.out.println("The String list is " +l1);
    }
    
    List<Integer> l3 = new ArrayList();
    {
    	l3.add(101);
    	l3.add(0, 103);
    	l3.addFirst(201);
    	System.out.println(l3);
    	
    	l3.addAll(l);
    	System.out.println("After adding to list" +l3);
    	
    	boolean b= l3.contains(300);
    	System.out.println(b);
    }
    
    
    
    }
	

}
