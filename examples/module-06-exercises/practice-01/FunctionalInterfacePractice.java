import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.BiPredicate;

public class FunctionalInterfacePractice {

    public static void main(String[] args) {

        System.out.println("===== 1. PREDICATE =====");
        predicatePractice();

        System.out.println("\n===== 2. FUNCTION =====");
        functionPractice();

        System.out.println("\n===== 3. BIFUNCTION =====");
        biFunctionPractice();

        System.out.println("\n===== 4. CONSUMER =====");
        consumerPractice();

        System.out.println("\n===== 5. SUPPLIER =====");
        supplierPractice();

        System.out.println("\n===== 6. BIPREDICATE =====");
        biPredicatePractice();
    }


    // --------------------------------------------------
    // 1. Predicate<T>
    // Abstract method:
    // boolean test(T t)
    // --------------------------------------------------

    private static void predicatePractice() {

        Predicate<Integer> isAdult =
                age -> age >= 18;

        boolean result = isAdult.test(20);

        System.out.println("Is age 20 an adult?");
        System.out.println(result);
    }


    // --------------------------------------------------
    // 2. Function<T, R>
    // Abstract method:
    // R apply(T t)
    // --------------------------------------------------

    private static void functionPractice() {

        Function<String, Integer> getLength =
                text -> text.length();

        int result = getLength.apply("Java");

        System.out.println("Length of Java:");
        System.out.println(result);
    }


    // --------------------------------------------------
    // 3. BiFunction<T, U, R>
    // Abstract method:
    // R apply(T t, U u)
    // --------------------------------------------------

    private static void biFunctionPractice() {

        BiFunction<Integer, Integer, Integer> add =
                (a, b) -> a + b;

        int result = add.apply(10, 20);

        System.out.println("10 + 20:");
        System.out.println(result);
    }


    // --------------------------------------------------
    // 4. Consumer<T>
    // Abstract method:
    // void accept(T t)
    // --------------------------------------------------

    private static void consumerPractice() {

        Consumer<String> printName =
                name -> System.out.println("Hello, " + name);

        printName.accept("Samuel");
    }


    // --------------------------------------------------
    // 5. Supplier<T>
    // Abstract method:
    // T get()
    // --------------------------------------------------

    private static void supplierPractice() {

        Supplier<String> message =
                () -> "Welcome to Module 6!";

        String result = message.get();

        System.out.println(result);
    }


    // --------------------------------------------------
    // 6. BiPredicate<T, U>
    // Abstract method:
    // boolean test(T t, U u)
    // --------------------------------------------------

    private static void biPredicatePractice() {

        BiPredicate<String, Integer> hasMinimumLength =
                (text, minimum) -> text.length() >= minimum;

        boolean result =
                hasMinimumLength.test("Java", 4);

        System.out.println("Is Java at least 4 characters?");
        System.out.println(result);
    }
}