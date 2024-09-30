package sohana123;
import java.util.Scanner;
		class Area {
		    double radius, length, width;
		    Area(double radius, double length, double width) {
		        this.radius = radius;
		        this.length = length;
		        this.width = width;
		    }
		    void carea() {
		        double circleArea = Math.PI * radius * radius;
		        System.out.printf("Area of circle with radius %.2f is: %.2f%n", radius, circleArea);
		    }
		    void rarea() {
		        double rectangleArea = length * width;
		        System.out.printf("Area of rectangle with length %.2f and width %.2f is: %.2f%n", length, width, rectangleArea);
		    }
		}

		public class area {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter radius, length, and width: ");
		        double radius = scanner.nextDouble();
		        double length = scanner.nextDouble();
		        double width = scanner.nextDouble();
		        Area area = new Area(radius, length, width);
		        area.carea(); 
		        area.rarea();  

		        scanner.close();
		    }
		}


	}

}
