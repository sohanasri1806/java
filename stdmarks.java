package sohana123;
import java.util.Scanner;
		class Student {
		    String name;
		    String studentID;
		    int mark1, mark2, mark3;
		    int totalMarks;
		    Student(String name, String studentID, int mark1, int mark2, int mark3) {
		        this.name = name;
		        this.studentID = studentID;
		        this.mark1 = mark1;
		        this.mark2 = mark2;
		        this.mark3 = mark3;
		        this.totalMarks = calculateTotalMarks();
		    }
		    int calculateTotalMarks() {
		        return mark1 + mark2 + mark3;
		    }
		}

		public class stdmarks {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter details for the first student:");
		        System.out.print("Name: ");
		        String name1 = scanner.nextLine();
		        System.out.print("Student ID: ");
		        String studentID1 = scanner.nextLine();
		        System.out.print("Enter marks for 3 subjects: ");
		        int mark1_1 = scanner.nextInt();
		        int mark1_2 = scanner.nextInt();
		        int mark1_3 = scanner.nextInt();
		        scanner.nextLine();  
		        System.out.println("Enter details for the second student:");
		        System.out.print("Name: ");
		        String name2 = scanner.nextLine();
		        System.out.print("Student ID: ");
		        String studentID2 = scanner.nextLine();
		        System.out.print("Enter marks for 3 subjects: ");
		        int mark2_1 = scanner.nextInt();
		        int mark2_2 = scanner.nextInt();
		        int mark2_3 = scanner.nextInt();
		        Student student1 = new Student(name1, studentID1, mark1_1, mark1_2, mark1_3);
		        Student student2 = new Student(name2, studentID2, mark2_1, mark2_2, mark2_3);
		        if (student1.totalMarks > student2.totalMarks) {
		            System.out.println("\nThe student with the highest score is: " + student1.name);
		            System.out.println("Total Marks: " + student1.totalMarks);
		        } else if (student2.totalMarks > student1.totalMarks) {
		            System.out.println("\nThe student with the highest score is: " + student2.name);
		            System.out.println("Total Marks: " + student2.totalMarks);
		        } else {
		            System.out.println("\nBoth students have the same total marks.");
		        }

		        scanner.close();
		

	}

}
