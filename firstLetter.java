import java.util.Scanner;

public class FirstLetterPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(name.charAt(i))) {
                System.out.println("The first letter of your name is: " + name.charAt(i));
                break;
            }
        }

        scanner.close();
    }
}
