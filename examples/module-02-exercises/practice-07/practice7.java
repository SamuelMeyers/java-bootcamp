import java.util.Scanner;

public class practice7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. IF...ELSE

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num >= 0) {
            System.out.println("Number is positive or zero.");
        } else {
            System.out.println("Number is negative.");
        }


        // 2. IF...ELSE IF...ELSE

        System.out.print("Enter your grade (0-100): ");
        int marks = scanner.nextInt();

        String grade;

        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 75) {
            grade = "B";
        } else {
            grade = "C";
        }

        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
}