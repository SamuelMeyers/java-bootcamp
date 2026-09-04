import java.util.HashMap;
import java.util.Map;

public class ConfigurationPractice {

    public static void main(String[] args) {

        Map<String, String> settings = new HashMap<>();

        settings.put("theme", "dark");
        settings.put("language", "English");
        settings.put("notifications", "enabled");

        System.out.println("Application Settings:");

        System.out.println(
                "Theme: " + settings.get("theme")
        );

        System.out.println(
                "Language: " + settings.get("language")
        );

        System.out.println(
                "Notifications: " + settings.get("notifications")
        );
    }
}