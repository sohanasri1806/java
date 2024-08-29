class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name; 
        this.age = age;    
    }
    public void printDetails() {
        System.out.println("Name: " + this.name); 
        System.out.println("Age: " + this.age);
    }
}
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Sohana",18);
        Person person2 = new Person("Bhaswanth", 14);
        System.out.println("Person 1 Details:");
        person1.printDetails();
        System.out.println("\nPerson 2 Details:");
        person2.printDetails();
    }
}
