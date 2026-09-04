import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {

        List<String> titles = new ArrayList<>(
                List.of(
                        "Java 21",
                        "Deprecated API",
                        "Clean Code",
                        "Deprecated Library"
                )
        );

        Iterator<String> iterator = titles.iterator();

        while (iterator.hasNext()) {

            String title = iterator.next();

            if (title.startsWith("Deprecated")) {
                iterator.remove();
            }
        }

        System.out.println("Remaining: " + titles);
    }
}
