import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImperativeVsFunctional {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("IMPERATIVE:");
        imperativeExample(numbers);

        System.out.println();

        System.out.println("FUNCTIONAL:");
        functionalExample(numbers);
    }

    public static void imperativeExample(List<Integer> numbers) {

        List<Integer> result = new ArrayList<>();

        for (int number : numbers) {

            if (number % 2 == 0) {
                result.add(number * 2);
            }
        }

        System.out.println(result);
    }

    public static void functionalExample(List<Integer> numbers) {

        List<Integer> result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .toList();

        System.out.println(result);
    }
}