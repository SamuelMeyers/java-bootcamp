public class AbstractClassPractice {

    public static void main(String[] args) {

        PracticeAnimal animal1 = new PracticeDog("Buddy");
        PracticeAnimal animal2 = new PracticeCat("Whiskers");

        System.out.println("--- Dog ---");

        animal1.eat();
        animal1.sound();
        animal1.move();

        System.out.println();

        System.out.println("--- Cat ---");

        animal2.eat();
        animal2.sound();
        animal2.move();
    }
}


// ABSTRACT PARENT CLASS
abstract class PracticeAnimal {

    String name;

    // Constructor
    PracticeAnimal(String name) {
        this.name = name;
    }

    // Concrete method
    void eat() {
        System.out.println(name + " eats");
    }

    // Abstract methods
    abstract void sound();

    abstract void move();
}


// CHILD CLASS
class PracticeDog extends PracticeAnimal {

    PracticeDog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Bark");
    }

    @Override
    void move() {
        System.out.println("Walks");
    }
}


// CHILD CLASS
class PracticeCat extends PracticeAnimal {

    PracticeCat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Meow");
    }

    @Override
    void move() {
        System.out.println("Runs");
    }
}
