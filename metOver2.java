class Person {
   String firstName, lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private String employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);  
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Sohana", "D");
        Employee employee = new Employee("Robert", "S", "EMP1", "Software Engineer");
        System.out.println("Person First Name: " + person.getFirstName());
        System.out.println("Person Last Name: " + person.getLastName());
        System.out.println("Employee First Name: " + employee.getFirstName());
        System.out.println("Employee Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
