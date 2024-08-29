package programs;
class Animal{
	public void move()
	{
		System.out.println("Animal is moving");
	}
}
	class Cheetah extends Animal{
		public void move()
		{
			System.out.println("Cheetah is moving");
		}
	}

public class metOver {

	public static void main(String[] args) {
		Cheetah myObj=new Cheetah();
		myObj.move();
		

	}

}
