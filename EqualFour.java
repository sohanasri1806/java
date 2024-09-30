package sohana123;
import java.util.Scanner;
public class EqualFour {

	public static void main(String[] args) {
		int n1,n2,n3,n4;
		Scanner Input=new Scanner(System.in);
		System.out.println("Enter first number: ");
		n1=Input.nextInt();
		System.out.println("Enter second number: ");
		n2=Input.nextInt();
		System.out.println("Enter third number: ");
		n3=Input.nextInt();
		System.out.println("Enter fourth number: ");
		n4=Input.nextInt();
		if(n1==n2 && n1==n3 && n1==n4)
		{
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
	}

}
