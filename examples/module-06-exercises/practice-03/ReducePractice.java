import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducePractice {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(5, 3, 8, 2, 9);

        // 1. SUM
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum);


        // 2. PRODUCT
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product: " + product);


        // 3. MAXIMUM
        Optional<Integer> maximum = numbers.stream()
                .reduce((a, b) -> Math.max(a, b));

        System.out.println(
                "Maximum: " + maximum.orElse(0)
        );


        // 4. MINIMUM
        Optional<Integer> minimum = numbers.stream()
                .reduce((a, b) -> Math.min(a, b));

        System.out.println(
                "Minimum: " + minimum.orElse(0)
        );


        // 5. STRING CONCATENATION
        List<String> words =
                Arrays.asList("Java", " ", "is", " ", "fun");

        String sentence = words.stream()
                .reduce("", (a, b) -> a + b);

        System.out.println("Sentence: " + sentence);
    }
}
