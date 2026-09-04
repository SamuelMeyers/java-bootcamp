import java.util.ArrayList;
import java.util.List;

public class OrderedDataPractice {

    public static void main(String[] args) {

        List<String> orderHistory = new ArrayList<>();

        orderHistory.add("Order #1001");
        orderHistory.add("Order #1002");
        orderHistory.add("Order #1003");

        System.out.println("Order History:");

        for (String order : orderHistory) {
            System.out.println(order);
        }

        System.out.println();

        System.out.println(
                "First order: " + orderHistory.get(0)
        );
    }
}