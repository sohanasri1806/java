package programs;

class outer {
	int x=10;
	class InnerClass{
		int y=5;
	}
}
public class OuterClass
{
	public static void main(String[] args) {
outer myOut=new outer();
outer.InnerClass myIn=myOut.new InnerClass();
System.out.println(myIn.y+myOut.x);
	}
}
