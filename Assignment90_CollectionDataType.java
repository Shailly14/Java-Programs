package assignments_List;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment90_CollectionDataType
{

	public static void main(String[] args) 
	{
          Collection<Integer> c = new ArrayList<Integer>();
          c.add(100);
          c.add(200);
          c.add(400);
          
          System.out.println("The interger list is " +c);
          
          Collection<String> str = new ArrayList<String>();
          str.add("Shailly");
          str.add("Dolly");
          str.add("Salony");
          System.out.println("The string list is " +str);
          
          Collection<Character> chr = new ArrayList <Character> ();
          chr.add('A');
          chr.add('b');
          chr.add('c');
          
          System.out.println("The character list is " +chr);
          
          Collection<Double> bln = new ArrayList<Double>();
         bln.add(12.8);
         bln.add(56.090);
          
          
          System.out.println("The double list is " +bln);
          
          chr.remove('A');
          
          System.out.println("After removing the A " +chr);
          
          boolean b1= c.contains(100);
          System.out.println("Whether list contains 100 or not " +b1);
          
       int i=  c.size();
        System.out.println("The Size of the list is " +i);
        
        
        
        
	}

}
