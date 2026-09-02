public class ObjectsPractice {

    public static void main(String[] args) {

        // Create two separate Car objects
        Car car1 = new Car();
        Car car2 = new Car();

        // Give car1 its own values
        car1.brand = "Toyota";
        car1.speed = 120;

        // Give car2 its own values
        car2.brand = "Honda";
        car2.speed = 80;

        // Call the method for each object
        car1.displayInfo();
        car2.displayInfo();
    }


    // Car class = blueprint
    static class Car {

        // Fields
        String brand;
        int speed;

        // Method
        void displayInfo() {
            System.out.println(
                    "Brand: " + brand +
                            ", Speed: " + speed + " km/h"
            );
        }
    }
}