package sohana123;
		interface Shape {
		    int length = 0; 
		    int width = 0;

		    void printArea(); 
		}
		class Rectangle implements Shape {
		    int length, width;
		    Rectangle(int length, int width) {
		        this.length = length;
		        this.width = width;
		    }
		    public void printArea() {
		        int area = length * width;
		        System.out.println("Rectangle Area: " + area);
		    }
		}
		class Triangle implements Shape {
		    int base, height;
		    Triangle(int base, int height) {
		        this.base = base;
		        this.height = height;
		    }
		    public void printArea() {
		        double area = 0.5 * base * height;
		        System.out.println("Triangle Area: " + area);
		    }
		}
		class Circle implements Shape {
		    int radius;
		    Circle(int radius) {
		        this.radius = radius;
		    }
		    public void printArea() {
		        double area = Math.PI * radius * radius;
		        System.out.println("Circle Area: " + area);
		    }
		}
		public class shapeArea {
		    public static void main(String[] args) {
		        Rectangle rectangle = new Rectangle(5, 6);
		        Triangle triangle = new Triangle(4, 7);
		        Circle circle = new Circle(3);
		        rectangle.printArea();
		        triangle.printArea();
		        circle.printArea();
		    }

	}


