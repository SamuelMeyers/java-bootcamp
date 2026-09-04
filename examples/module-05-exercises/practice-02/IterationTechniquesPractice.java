import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class IterationTechniquesPractice {

    public static void main(String[] args) {

        System.out.println("1. FOR LOOP");
        forLoopExample();

        System.out.println();

        System.out.println("2. ENHANCED FOR LOOP");
        enhancedForLoopExample();

        System.out.println();

        System.out.println("3. ITERATOR");
        iteratorExample();

        System.out.println();

        System.out.println("4. LISTITERATOR");
        listIteratorExample();

        System.out.println();

        System.out.println("5. STREAM API");
        streamExample();

        System.out.println();

        System.out.println("6. ENUMERATION");
        enumerationExample();
    }

    private static void forLoopExample() {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    private static void enhancedForLoopExample() {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void iteratorExample() {

        List<String> names =
                new ArrayList<>(Arrays.asList(
                        "Alice",
                        "Bob",
                        "Charlie"
                ));

        Iterator<String> iterator =
                names.iterator();

        while (iterator.hasNext()) {

            String name = iterator.next();

            System.out.println(name);
        }
    }

    private static void listIteratorExample() {

        List<String> names =
                new ArrayList<>(Arrays.asList(
                        "Alice",
                        "Bob",
                        "Charlie"
                ));

        ListIterator<String> iterator =
                names.listIterator();

        System.out.println("Forward:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Backward:");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    private static void streamExample() {

        List<String> names =
                Arrays.asList(
                        "Alice",
                        "Bob",
                        "Amanda",
                        "Charlie"
                );

        names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    private static void enumerationExample() {

        Vector<String> names =
                new Vector<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Enumeration<String> enumeration =
                names.elements();

        while (enumeration.hasMoreElements()) {

            String name =
                    enumeration.nextElement();

            System.out.println(name);
        }
    }
}