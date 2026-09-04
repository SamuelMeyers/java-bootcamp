import java.util.HashMap;
import java.util.Map;

public class LookupPractice {

    public static void main(String[] args) {

        Map<Integer, String> users = new HashMap<>();

        users.put(101, "Samuel");
        users.put(102, "Alice");
        users.put(103, "Bob");

        int searchId = 102;

        String user = users.get(searchId);

        System.out.println("Searching for ID: " + searchId);
        System.out.println("Found: " + user);
    }
}