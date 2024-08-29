class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
    public void sound() {
        System.out.println("The animal is making a sound.");
    }
}
class Lion extends Animal {
    public void eat() {
        System.out.println("The lion eats meat.");
    }
    public void sound() {
        System.out.println("The lion roars.");
    }
}
class Tiger extends Animal {
    public void eat() {
        System.out.println("The tiger eats meat.");
    }
    public void sound() {
        System.out.println("The tiger growls.");
    }
}
class Panther extends Animal {
    @Override
    public void eat() {
        System.out.println("The panther eats meat.");
    }
    public void sound() {
        System.out.println("The panther growls.");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal panther = new Panther();
        System.out.println("Lion:");
        lion.eat();
        lion.sound();
        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sound();
        System.out.println("\nPanther:");
        panther.eat();
        panther.sound();
    }
}
