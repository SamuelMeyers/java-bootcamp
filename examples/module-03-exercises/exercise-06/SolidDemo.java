public class SolidDemo {

    // Responsibility #1:
    // Calculate the interest and return the result.
    // This method does NOT print anything.
    static double calculateInterest(
            double balance, double ratePercent) {

        return balance * ratePercent / 100.0;
    }

    // Responsibility #2:
    // Display the interest.
    // This method does NOT calculate anything.
    static void printInterest(double interest) {

        System.out.printf(
                "Interest earned: %.2f%n", interest);
    }

    public static void main(String[] args) {

        // Responsibility #3:
        // Coordinate the other methods.
        double interest = calculateInterest(10_000, 5);

        printInterest(interest);
    }
}
