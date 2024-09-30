package sohana123;

abstract class Animal{
	abstract void cats();
	abstract void dogs();
}
class Cats extends Animal{
	void cats()
	{
		System.out.println("cat meows");
	}
	void dogs()
	{
		
	}
class Dogs extends Animal{
	void cats(){
		
	}
	void dogs()
	{
		System.out.println("Dog barks");
	}
}
public class main{
	public static void main(String[] args)
	{
		Cats c1=new Cats();
		Dogs d1=new Dogs();
		c1.cats();
		d1.dogs();

	}

}

