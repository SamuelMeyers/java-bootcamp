import java.util.Scanner;

public class ProductInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        // Read product name (may include spaces)
        String name = scanner.nextLine();

        System.out.print("Quantity: ");
        // Read a full line, then parse to int
        int qty = Integer.parseInt(scanner.nextLine());

        System.out.print("Price: ");
        // Read a full line, then parse to double
        double price = Double.parseDouble(scanner.nextLine());

        // Print product information
        System.out.printf("Product: %s | Qty: %d | Price: %.2f%n",
                name, qty, price);

        scanner.close();
    }
}