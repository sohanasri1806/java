package programs;
class Animal{
	public void display()
	{
	System.out.println("It is an animal");
}
}
	class Dog extends Animal{
		public void display() {
			System.out.println("It is a dog");
		}
	}
public class overriding {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.display();

	}

}
