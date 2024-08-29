package programs;

public class cat {
	int x;
	String name;
	public cat() {
	x=0;
	name="Unknown";
	}

	public static void main(String[] args) {
		cat myObj=new cat();
		cat myObj1=new cat();
		System.out.println(myObj.x);
		System.out.println(myObj1.name);

	}

}
