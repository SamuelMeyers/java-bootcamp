public class MutableImmutablePractice {

    public static void main(String[] args) {

        // MUTABLE: StringBuilder

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Before append:");
        System.out.println(sb);

        sb.append(" World");

        System.out.println("After append:");
        System.out.println(sb);


        System.out.println();


        // IMMUTABLE: String

        String s1 = "Hello";

        String s2 = s1.concat(" World");

        System.out.println("Original String:");
        System.out.println(s1);

        System.out.println("New String:");
        System.out.println(s2);
    }
}
