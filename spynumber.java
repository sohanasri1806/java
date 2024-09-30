package sohana123;
import java.util.Scanner;
public class spynumber {

	public static void main(String[] args) {
		int n,r,sum=0,prod=1;
		Scanner Input=new Scanner(System.in);
		System.out.println("Enter number: ");
		n=Input.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			prod=prod*r;
			n=n/10;
		}
		if(sum==prod)
		{
			System.out.println("Spynumber");
		}
		else
		{
			System.out.println("Not a spynumber");
		}
	}

}
