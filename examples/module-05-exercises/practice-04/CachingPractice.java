import java.util.LinkedHashMap;
import java.util.Map;

public class CachingPractice {

    public static void main(String[] args) {

        Map<Integer, String> cache = new LinkedHashMap<>();

        cache.put(101, "Samuel");
        cache.put(102, "Alice");
        cache.put(103, "Bob");

        System.out.println("Cache:");
        System.out.println(cache);

        System.out.println("User 102:");
        System.out.println(cache.get(102));
    }
}