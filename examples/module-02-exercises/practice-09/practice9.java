import java.util.Scanner;

public class practice9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. FOR LOOP - BREAK AND CONTINUE

        System.out.println("BREAK AND CONTINUE:");

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            }

            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }

        // 2. NESTED FOR LOOP

        System.out.println("NESTED FOR LOOP:");

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }

            System.out.println();
        }

        // 3. WHILE LOOP - SUM 1 THROUGH N

        System.out.println("WHILE LOOP:");

        int n = 5;
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum: " + sum);

        // 4. DO-WHILE LOOP - MENU

        System.out.println("DO-WHILE LOOP:");

        int choice;

        do {
            System.out.println("1) Add");
            System.out.println("2) View");
            System.out.println("3) Exit");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Add selected");
            } else if (choice == 2) {
                System.out.println("View selected");
            } else if (choice == 3) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice");
            }

        } while (choice != 3);


        scanner.close();
    }
}