public class RuntimePolymorphism {

    public static void main(String[] args) {

        // Reference type is PolyAnimal
        PolyAnimal animal;

        // Actual object is PolyDog
        animal = new PolyDog();
        animal.sound();

        // Same reference, now actual object is PolyCat
        animal = new PolyCat();
        animal.sound();
    }
}


// Parent class
class PolyAnimal {

    void sound() {
        System.out.println("Animal sound");
    }
}


// Child class
class PolyDog extends PolyAnimal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}


// Another child class
class PolyCat extends PolyAnimal {

    @Override
    void sound() {
        System.out.println("Meow");
    }
}