package programs;
import java.util.Scanner;
public class studentDetails {
	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in);
		Scanner Input1=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=Input.nextLine();
		System.out.println("Enter your city: ");
		String city=Input.nextLine();
		System.out.println("Enter roll no: ");
		int no=Input1.nextInt();
		System.out.println("Enter Department: ");
		String dept=Input.nextLine();
		System.out.println("Enter section: ");
		String sec=Input.nextLine();
		System.out.println("Name: "+name);
		System.out.println("Name: "+city);
		System.out.println("Roll no: "+no);
		System.out.println("Department: "+dept);
		System.out.println("Section: "+sec);
		
	}

}
