import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupingPractice {

    public static void main(String[] args) {

        Map<String, List<String>> customerOrders =
                new HashMap<>();

        customerOrders.put(
                "Samuel",
                new ArrayList<>()
        );

        customerOrders.put(
                "Alice",
                new ArrayList<>()
        );

        customerOrders.get("Samuel").add("Order #1001");
        customerOrders.get("Samuel").add("Order #1002");

        customerOrders.get("Alice").add("Order #1003");

        System.out.println("Samuel's Orders:");

        for (String order : customerOrders.get("Samuel")) {
            System.out.println(order);
        }

        System.out.println();

        System.out.println("Alice's Orders:");

        for (String order : customerOrders.get("Alice")) {
            System.out.println(order);
        }
    }
}