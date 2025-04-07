package assignments_List;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment75_ArrayWithScanner 
{

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Array size ");
		
		 int rollno[] =new int[s1.nextInt()];
		 for (int i =0;i<=rollno.length-1;i++) 
		 {
			 System.out.println("Enter array index" +i);

			 rollno[i]=s1.nextInt();
		 }
		 System.out.println(Arrays.toString(rollno));
		 s1.close();
		 
	}

}
