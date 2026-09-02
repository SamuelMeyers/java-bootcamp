public class practice1 {

    public static void main(String[] args) {

        // Create a Car object
        Car myCar = new Car();

        // Give the object values
        myCar.color = "Red";
        myCar.speed = 120;

        // Print information about the object
        System.out.println("Car color: " + myCar.color);
        System.out.println("Car speed: " + myCar.speed);

        // Call the object's method
        myCar.drive();
    }
}


// Class = blueprint for creating Car objects
class Car {

    // Fields / attributes
    String color;
    int speed;

    // Method / behavior
    void drive() {
        System.out.println("Driving");
    }
}