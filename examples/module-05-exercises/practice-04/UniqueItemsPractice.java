import java.util.HashSet;
import java.util.Set;

public class UniqueItemsPractice {

    public static void main(String[] args) {

        Set<String> roles = new HashSet<>();

        roles.add("ADMIN");
        roles.add("USER");
        roles.add("MANAGER");
        roles.add("USER");
        roles.add("ADMIN");

        System.out.println("Roles:");
        System.out.println(roles);
    }
}