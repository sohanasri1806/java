package sohana123;
import java.util.Scanner;
public class highestProd {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        String highestProductName = "";
		        int highestQuantity = 0;
		        int highestCost = 0;
		        int highestValue = 0;
		        System.out.print("Enter the number of products: ");
		        int numProducts = scanner.nextInt();
		        scanner.nextLine(); 
		        for (int i = 0; i < numProducts; i++) {
		            System.out.println("Enter details for product " + (i + 1) + ":");

		            System.out.print("Product Name: ");
		            String productName = scanner.nextLine();

		            System.out.print("Quantity: ");
		            int quantity = scanner.nextInt();

		            System.out.print("Cost per item: ");
		            int cost = scanner.nextInt();
		            scanner.nextLine(); 

		            int value = quantity * cost; 

		            
		            if (value > highestValue) {
		                highestProductName = productName;
		                highestQuantity = quantity;
		                highestCost = cost;
		                highestValue = value;
		            }
		        }
		        System.out.println("\nProduct with the highest value:");
		        System.out.println("Product Name: " + highestProductName);
		        System.out.println("Quantity: " + highestQuantity);
		        System.out.println("Cost per item: $" + highestCost);
		        System.out.println("Total Value: $" + highestValue);

		        scanner.close();
		    }
		}


	}

}
