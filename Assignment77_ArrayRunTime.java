package assignments_List;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment77_ArrayRunTime {

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Array size ");
		
		 int num[] =new int[s1.nextInt()];
		 for (int i =0;i<=num.length-1;i++) 
		 {
			 System.out.println("Enter array index" +i);

			 num[i]=s1.nextInt();
		 }
		 System.out.println(Arrays.toString(num));
		 s1.close();
     		   
	}

}
