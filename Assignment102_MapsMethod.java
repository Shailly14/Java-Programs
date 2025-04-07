package assignments_List;

import java.util.HashMap;
import java.util.Map;

public class Assignment102_MapsMethod 
{

	public static void main(String[] args) 
	{
           Map<String, Integer> m1 = new HashMap<String, Integer>();
           m1.put("Table", 200);
           m1.put("Chair", 2034);
           m1.put("Kite", 3030);
           System.out.println(m1);
	
          Map<String,Integer> m2 = new HashMap<String,Integer>();
          m2.put("SHailly", 20);
          m2.put("pjk", 203);
          System.out.println("Before putting all" +m2);
          m2.putAll(m1);
          System.out.println("After putting m1" +m2);
          
          m2.putIfAbsent("lemon", 700);
          System.out.println("CHeck if absent" +m2);
          
          m2.containsKey("Table");
          System.out.println("Chekc" +m2);
          
          m2.get("SHailly");
          System.out.println("Get the object key " +m2);

}}