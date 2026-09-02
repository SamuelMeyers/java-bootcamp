public class InterfacePractice {

    public static void main(String[] args) {

        // 1. SAME INTERFACE, DIFFERENT CLASSES

        Drawable shape1 = new Circle(5.0);
        Drawable shape2 = new Rectangle(4.0, 6.0);

        shape1.draw();
        shape1.info();

        shape2.draw();
        shape2.info();

        // Static method belongs to the interface itself
        Drawable.help();



        // 2. MULTIPLE INTERFACES

        Duck duck = new Duck();

        duck.fly();
        duck.swim();
    }
}


// INTERFACE 1

interface Drawable {

    // Abstract method
    void draw();

    // Default method
    default void info() {
        System.out.println("This object is drawable.");
    }

    // Static method
    static void help() {
        System.out.println("Drawable objects must implement draw().");
    }
}

// CIRCLE IMPLEMENTS DRAWABLE

class Circle implements Drawable {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius " + radius);
    }
}

// RECTANGLE IMPLEMENTS DRAWABLE

class Rectangle implements Drawable {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(
                "Drawing Rectangle " + width + " x " + height
        );
    }
}

// MULTIPLE INTERFACES

interface Flyable {

    void fly();
}

interface Swimmable {

    void swim();
}


// Duck implements TWO interfaces
class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}