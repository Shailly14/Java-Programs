package assignments_List;

abstract class Vehicle
{
  abstract void start();
  abstract void stop();
 
}
abstract class Car extends Vehicle
{
	abstract void start11();
	abstract void stop11();

}

public class Assignment49_AbstarctMethod extends Vehicle
{

	void start() 
	{
		System.out.println("Start Vehicle");
	}

	void stop() 
	{
		System.out.println("Stop vehicle");
	}

void start11() 
	{
		System.out.println("start car");
	}


	void stop11() 
	
	{
		System.out.println("stop car");
	}
	public static void main(String[] args) 
	{
		Assignment49_AbstarctMethod a1 = new Assignment49_AbstarctMethod();
		a1.start();
		a1.start11();
		a1.stop();
		a1.stop11();
	}


}
