public class InheritancePractice {

    public static void main(String[] args) {

        // Create a PracticeCar object
        PracticeCar myCar = new PracticeCar("Toyota", 4);

        // Inherited field from Vehicle
        myCar.maxSpeed = 180;

        // Overridden method
        myCar.start();

        // PracticeCar's own method
        myCar.playMusic();

        // Inherited method
        myCar.stop();

        System.out.println("Brand: " + myCar.brand);
        System.out.println("Max Speed: " + myCar.maxSpeed);
        System.out.println("Number of Doors: " + myCar.numDoors);
    }
}


// Superclass / Parent class
class Vehicle {

    String brand;
    int maxSpeed;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("Vehicle started");
    }

    void stop() {
        System.out.println("Vehicle stopped");
    }
}


// Subclass / Child class
class PracticeCar extends Vehicle {

    int numDoors;

    PracticeCar(String brand, int numDoors) {

        // Call parent constructor
        super(brand);

        this.numDoors = numDoors;
    }

    @Override
    void start() {
        System.out.println("Car started with key");
    }

    void playMusic() {
        System.out.println("Playing music");
    }
}