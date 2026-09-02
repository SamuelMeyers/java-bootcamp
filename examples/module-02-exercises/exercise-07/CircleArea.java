import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Radius: ");

        // Read radius as a double
        double r = Double.parseDouble(scanner.nextLine());

        // Calculate area = π × r²
        double area = Math.PI * r * r;

        // Print area with two decimal places
        System.out.printf("Area: %.2f%n", area);

        scanner.close();
    }
}