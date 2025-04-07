package assignments_List;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment78_TwoArrays 
{

	public static void main(String[] args)
	{
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the size of first array" );
      int[] array1= new int[ s1.nextInt()];
      int array2[]= new int[array1.length];
      
      for(int i=0;i<array1.length-1;i++)
      {
    	  System.out.println("Enter the value of the array" +i);
    	  array1[i]= s1.nextInt();
    	  
    	  System.out.println("Enter the value of the 2nd array" +i);
           array2[i]=s1.nextInt();
    	  
      }
      System.out.println("Array of string is " +Arrays.toString(array1));
      System.out.println("Array of string is " +Arrays.toString(array2));
              boolean b1 =  Arrays.equals(array1, array2);
              if (b1==true)
              {
            	  System.out.println("Both are equal");
              }
              else
              {
            	  System.out.println("Both are not euqal");
              }
              s1.close();
	}

}
