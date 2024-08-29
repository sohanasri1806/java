class Rectangle {
    int length;
    int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int calculateArea() {
        return length * width;
    }
    public int calculatePerimeter() {
        return 2 * (length + width);
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,3);
        System.out.println("Initial Length: " + rectangle.getLength());
        System.out.println("Initial Width: " + rectangle.getWidth());
        rectangle.setLength(10);
        rectangle.setWidth(4);
        System.out.println("Modified Length: " + rectangle.getLength());
        System.out.println("Modified Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
