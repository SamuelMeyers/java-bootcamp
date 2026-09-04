import java.util.Map;
import java.util.TreeMap;

public class SortedDataPractice {

    public static void main(String[] args) {

        Map<Integer, String> leaderboard = new TreeMap<>();

        leaderboard.put(3, "Charlie");
        leaderboard.put(1, "Alice");
        leaderboard.put(4, "David");
        leaderboard.put(2, "Bob");

        System.out.println("Leaderboard:");

        for (Map.Entry<Integer, String> entry : leaderboard.entrySet()) {

            System.out.println(
                    entry.getKey() + ": " + entry.getValue()
            );
        }
    }
}