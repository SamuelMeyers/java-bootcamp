import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {

        // Create a Scanner reading from System.in
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        // Read the whole line as a String
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");

        // Read an int with nextInt()
        int age = scanner.nextInt();

        // Consume the leftover newline after nextInt()
        scanner.nextLine();

        System.out.print("Enter your city: ");

        // Read the city with nextLine()
        String city = scanner.nextLine();

        // Print the personal details
        System.out.printf("Hello, %s! You are %d years old and live in %s.%n",
                name, age, city);

        scanner.close();
    }
}