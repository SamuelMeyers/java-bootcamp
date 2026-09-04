import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AggregationPractice {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(2, 4, 6, 8, 10);

        System.out.println("===== AGGREGATION OPERATIONS =====");
        System.out.println("Numbers: " + numbers);


        // 1. SUM
        int sum = numbers.stream()
                .mapToInt(number -> number)
                .sum();

        System.out.println("Sum: " + sum);


        // 2. COUNT
        long count = numbers.stream()
                .count();

        System.out.println("Count: " + count);


        // 3. AVERAGE
        double average = numbers.stream()
                .mapToInt(number -> number)
                .average()
                .orElse(0);

        System.out.println("Average: " + average);


        // 4. MINIMUM
        int minimum = numbers.stream()
                .mapToInt(number -> number)
                .min()
                .orElse(0);

        System.out.println("Minimum: " + minimum);


        // 5. MAXIMUM
        int maximum = numbers.stream()
                .mapToInt(number -> number)
                .max()
                .orElse(0);

        System.out.println("Maximum: " + maximum);


        // 6. REDUCE
        int reducedTotal = numbers.stream()
                .reduce(
                        0,
                        (total, number) -> total + number
                );

        System.out.println("Reduced Total: " + reducedTotal);


        // 7. COLLECT
        List<Integer> numbersGreaterThanFive =
                numbers.stream()
                        .filter(number -> number > 5)
                        .collect(Collectors.toList());

        System.out.println(
                "Collected (> 5): " + numbersGreaterThanFive
        );


        // 8. GROUPING
        Map<String, List<Integer>> groupedNumbers =
                numbers.stream()
                        .collect(
                                Collectors.groupingBy(
                                        number ->
                                                number <= 5
                                                        ? "Small"
                                                        : "Large"
                                )
                        );

        System.out.println("Grouped: " + groupedNumbers);


        // 9. SUMMARY STATISTICS
        IntSummaryStatistics statistics =
                numbers.stream()
                        .mapToInt(number -> number)
                        .summaryStatistics();

        System.out.println();
        System.out.println("===== SUMMARY STATISTICS =====");

        System.out.println(
                "Count: " + statistics.getCount()
        );

        System.out.println(
                "Sum: " + statistics.getSum()
        );

        System.out.println(
                "Minimum: " + statistics.getMin()
        );

        System.out.println(
                "Average: " + statistics.getAverage()
        );

        System.out.println(
                "Maximum: " + statistics.getMax()
        );
    }
}
