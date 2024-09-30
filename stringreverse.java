package sohana123;
import java.util.Scanner;
public class stringreverse {

	public static void main(String[] args) {
		String name;
		Scanner Input=new Scanner(System.in);
		System.out.println("Enter a name: ");
		String s=Input.nextLine();
		
		String input=s.replaceAll("\\s+","").toLowerCase();
		String reversed="";
		for(int i=input.length()-1;i>=0;i--)
		{
			reversed+=input.charAt(i);
		}
		if(input.equals(reversed))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
