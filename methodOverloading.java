public class AreaCalculator {

    public int calculate(int side) {
        return side * side;
    }

    public int calculate(int length, int width) {
        return length * width;
    }

    public int calculate(int radius) {
        return (int) (Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        int squareArea = calculator.calculate(5);
        int rectangleArea = calculator.calculate(4, 6);
        int circleArea = calculator.calculate(3);

        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}
