package assignments_List;

import java.util.HashMap;
import java.util.Map;

public class Assignment100_Map
{

	public static void main(String[] args) 
	{
                    Map m1 = new HashMap();
                    m1.put("Shailly", 200);
                    m1.put("Dolly", 340);
                    m1.put("Hello" ,404);
                    System.out.println("The list is " +m1);
                    
                    
                    Map<String, Integer> m2 = new HashMap <String, Integer>();
                    {
                    	m2.put("Emp1", 101);
                    	m2.put("Emp2", 202);
                    	m2.put("Emp3", 303);
                    	System.out.println(m2);
                    }
                    
                   
	}

}
