package sohana123;
import java.util.Scanner;
public class dayWeek {

	public static void main(String[] args) {
		int n;
		Scanner Input=new Scanner(System.in);
		System.out.println("Enter number between 1 to 7: ");
		n=Input.nextInt();
		switch(n)
		{
		case 1: System.out.println("Sunday");break;
		case 2: System.out.println("Monday");break;
		case 3: System.out.println("Tuesday");break;
		case 4: System.out.println("Wednesday");break;
		case 5: System.out.println("Thursday");break;
		case 6: System.out.println("Friday");break;
		case 7: System.out.println("Saturday");break;
		}
		

	}

}
