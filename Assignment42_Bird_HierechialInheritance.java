package assignments_List;

class Animal //parent
{
	  void move()
   {
	   System.out.println("Animal is moving");
   }
}
class Fish extends Animal //subclass1
{
	  void swin()
	{
		System.out.println("Fish is swimming");
	}
}	
class Bird extends Animal //subclass 2
{
	
		  void fly()
		{
			System.out.println("Bird is d=flying");
		}
	
}
public class Assignment42_Bird_HierechialInheritance 
{

	public static void main(String[] args) 
	{
		Animal a1 = new Animal();
		a1.move();
		Fish f1 = new Fish();
		f1.swin();
		Bird b1 = new Bird();
		b1.fly();
	
	}

}	
		
	

	
