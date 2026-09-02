public class SingleInheritancePractice {

    public static void main(String[] args) {

        Dog dog = new Dog();

        // Inherited fields
        dog.name = "Tommy";
        dog.age = 3;

        // Dog's own field
        dog.breed = "Labrador";

        // Inherited methods
        dog.eat();
        dog.sleep();

        // Dog's own method
        dog.bark();

        // Overridden method
        dog.sound();
    }
}


// Superclass / Parent class
class Animal {

    String name;
    int age;

    Animal() {
        System.out.println("Animal constructor");
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    void sound() {
        System.out.println("Animal sound");
    }
}


// Subclass / Child class
class Dog extends Animal {

    String breed;

    Dog() {
        super();
        System.out.println("Dog constructor");
    }

    void bark() {
        System.out.println(name + " is barking");
    }

    @Override
    void sound() {
        super.sound();
        System.out.println("Dog says Bark");
    }
}