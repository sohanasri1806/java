package sohana123;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		int n,temp,r,sum=0;
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=Input.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
