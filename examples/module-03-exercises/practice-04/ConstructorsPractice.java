public class ConstructorsPractice {

    public static void main(String[] args) {

        // Uses the DEFAULT constructor
        Car car1 = new Car();

        // Uses the PARAMETERIZED constructor
        Car car2 = new Car("Toyota", 120);

        car1.display();
        car2.display();
    }


    static class Car {

        String brand;
        int speed;


        // DEFAULT CONSTRUCTOR
        Car() {
            brand = "Unknown";
            speed = 0;
        }


        // PARAMETERIZED CONSTRUCTOR
        Car(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }


        void display() {
            System.out.println(
                    "Brand: " + brand +
                            ", Speed: " + speed + " km/h"
            );
        }
    }
}
