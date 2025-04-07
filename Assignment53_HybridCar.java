package assignments_List;

interface CNGcar
{
	void drive();
	void cngkit();
}

interface PetrolCar
{
	void drive();
	void petrolkit();
}
public class Assignment53_HybridCar implements PetrolCar, CNGcar
{

	public static void main(String[] args)
	{
		Assignment53_HybridCar h1 = new Assignment53_HybridCar();
		h1.cngkit();
		h1.petrolkit();
		h1.drive();

	}

	
	public void cngkit() 
	{

		System.out.println("Hello to cng kit");
	}

	
	public void drive()
	{

		System.out.println("Drive the car");
	}

	
	public void petrolkit() 
	{

		System.out.println("Hello to petrol kit");
	}

}
