import java.util.Scanner;  // Built-in package
import tools.Greeting;     // Our package

public class practice11 {

    public static void main(String[] args) {

        // BUILT-IN PACKAGE EXAMPLE
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);


        // USER-DEFINED PACKAGE EXAMPLE
        Greeting.sayHello();


        scanner.close();
    }
}