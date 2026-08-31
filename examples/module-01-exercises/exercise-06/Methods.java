public class Methods {

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static String greet(String name) {
        String message = "Hello, " + name + "!";
        return message;
    }

    public static void main(String[] args) {
        int result = add(10, 20);
        String greeting = greet("Aman");

        System.out.println(result);
        System.out.println(greeting);
    }
}