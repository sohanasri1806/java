package sohana123;
import java.util.Scanner;
public class greatest3 {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the first number: ");
		        double num1 = scanner.nextDouble();
		        System.out.print("Enter the second number: ");
		        double num2 = scanner.nextDouble();
		        System.out.print("Enter the third number: ");
		        double num3 = scanner.nextDouble();
		        double greatest = num1;
		        if (num2 > greatest) {
		            greatest = num2;
		        }
		        if (num3 > greatest) {
		            greatest = num3;
		        }
		        System.out.println("The greatest number is: " + greatest);
		        scanner.close();
		  

	}

}
