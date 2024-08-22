package programs;

public class Add {
	public int sum(int x)
	{
		return x;
	}
	public int sum(int x,int y)
	{
		return (x+y);
	}
	public int sum(int x,int y,int z) 
	{
		return (x+y+z);
	}
	public double sum(double x,double y)
	{
		return (x+y);
	}
	public static void main(String[] args) {
		Add s=new Add();
		System.out.println(s.sum(5,10));
		System.out.println(s.sum(2,3,4));
		System.out.println(s.sum(2.5,7.5));
	}
}
