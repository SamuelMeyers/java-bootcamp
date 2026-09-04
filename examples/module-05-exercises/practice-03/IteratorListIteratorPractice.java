import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorListIteratorPractice {

    public static void main(String[] args) {

        System.out.println("===== ITERATOR PRACTICE =====");
        iteratorPractice();

        System.out.println();

        System.out.println("===== LISTITERATOR PRACTICE =====");
        listIteratorPractice();
    }

    public static void iteratorPractice() {

        List<String> names = new ArrayList<>(
                Arrays.asList("Alice", "Bob", "Charlie", "David")
        );

        System.out.println("Original List:");
        System.out.println(names);

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {

            String name = iterator.next();

            System.out.println("Checking: " + name);

            if (name.equals("Bob")) {
                iterator.remove();
                System.out.println("Removed Bob");
            }
        }

        System.out.println("After Iterator:");
        System.out.println(names);
    }

    public static void listIteratorPractice() {

        List<String> names = new ArrayList<>(
                Arrays.asList("Alice", "Bob", "Charlie", "David")
        );

        ListIterator<String> iterator =
                names.listIterator();

        System.out.println("Moving Forward:");

        while (iterator.hasNext()) {

            String name = iterator.next();

            System.out.println(name);
        }

        System.out.println();

        System.out.println("Moving Backward:");

        while (iterator.hasPrevious()) {

            String name = iterator.previous();

            System.out.println(name);
        }
    }
}
