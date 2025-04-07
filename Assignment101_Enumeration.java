package assignments_List;

import java.util.Enumeration;
import java.util.Vector;

public class Assignment101_Enumeration 
{

	public static void main(String[] args) 
	{
		Vector v = new Vector();
		{
			v.addElement(100);
			v.add(200);
			v.addFirst("shailly");
			System.out.println(v);
		}
        Enumeration e = v.elements();
        
        {
        	while(e.hasMoreElements())
        	{
        		System.out.println(e.nextElement());
        	
        	}
        }
	}

}
