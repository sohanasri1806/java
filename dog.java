package programs;

public class dog {
	String name,color;
	public dog(String n,String c) {
		name=n;
		color=c;
	}

	public static void main(String[] args) {
		dog myObj=new dog("Kitty","white");
		System.out.println(myObj.name);
		System.out.println(myObj.color);
	}

}
