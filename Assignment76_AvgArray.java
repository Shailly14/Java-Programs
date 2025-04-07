package assignments_List;

import java.util.Scanner;

public class Assignment76_AvgArray {

	public static void main(String[] args) 
	{
		Double avg=0.0;
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the size of  Array" );
      int num [] = new int[s1.nextInt()];
      for(int i = 0;i<=num.length-1;i++)
      {
    		System.out.println("Enter the value of array" +i );

    	  num[i]= s1.nextInt();
    	   avg = avg+num[i];
    	  
      }
 	 System.out.println("Average is" +avg);

      
      s1.close();
	}

}
