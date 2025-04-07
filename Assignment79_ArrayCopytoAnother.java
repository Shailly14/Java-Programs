package assignments_List;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment79_ArrayCopytoAnother 

{

	public static void main(String[] args) 
	{
          Scanner s1 = new Scanner(System.in);
          System.out.println("Enter you Size of Array");
         int input[]= new int[s1.nextInt()];
         
         for(int i= 0; i<=input.length-1;i++)
         {
        	System.out.println("Please enter input array " +i); 
        	input[i]=s1.nextInt();
         }
         System.out.println("The input array is " +Arrays.toString(input));
         
        int [] input1  =new int [input.length];
        for(int j=0; j<=input.length-1;j++)
        {
        	
        	input[j]=input[j];
        	
        }
        System.out.println("This is copied output string " +Arrays.toString(input));
        s1.close();
	}

}
