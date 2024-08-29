package programs;

class Computer{
	class Processor{
		public void displaydetails(){
			System.out.println("brand=intel\nspeed=100");
		}
	}
}
public class inher1 {

	public static void main(String[] args) {
		Computer myout=new Computer();
		Computer.Processor myin=myout.new Processor();
		myin.displaydetails();
		
	}

}
