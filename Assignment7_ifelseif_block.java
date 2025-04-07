package assignments_List;

public class Assignment7_ifelseif_block 
{
	public static void main(String[] args) 
	{
		int score = 100;
    
	    if(score >= 90)  //condition fail
	    {
	    	System.out.println("Student score A1");
	    }
	    else if(score <=80)  // condition fail
	    {
	    	System.out.println("Student score A2");
	    }
	    else if(score>=50) // condition pass
	    {
	    	System.out.println("Student is pass");
	    }
	    
	    else
	    {
	    System.out.println("Student is fail");
	    }
}
}