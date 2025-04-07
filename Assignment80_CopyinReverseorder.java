package assignments_List;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment80_CopyinReverseorder 
{

	public static void main(String[] args) 
	{
          Scanner s1 = new Scanner(System.in);
          System.out.println(" Enter the size of Array ");
                 int var [] = new int [ s1.nextInt()];
                  int i,j;
                  int[] var2= new int [var.length];
                 for( i = 0,j=var2.length-1; i<=var.length-1;i++,j--)
                 {
                	 System.out.println(" ENter the first array value" +i);
                	var [i]= s1.nextInt();
                	var2[j]=var[i];
                 }
                 System.out.println(" The input array is " +Arrays.toString(var));
                 
                 
          
                 System.out.println("The reverse string is" +Arrays.toString(var2));
                 s1.close();
	}

}
