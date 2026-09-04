import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfacePractice {

    public static void main(String[] args) {

        System.out.println("1. PREDICATE");
        predicatePractice();

        System.out.println("\n2. FUNCTION");
        functionPractice();

        System.out.println("\n3. CONSUMER");
        consumerPractice();

        System.out.println("\n4. SUPPLIER");
        supplierPractice();

        System.out.println("\n5. UNARY OPERATOR");
        unaryOperatorPractice();

        System.out.println("\n6. BINARY OPERATOR");
        binaryOperatorPractice();
    }

    private static void predicatePractice() {

        Predicate<Integer> isAdult =
                age -> age >= 18;

        System.out.println("Age 20: " + isAdult.test(20));
        System.out.println("Age 15: " + isAdult.test(15));
    }

    private static void functionPractice() {

        Function<String, Integer> getLength =
                text -> text.length();

        int length = getLength.apply("Java");

        System.out.println("Length of Java: " + length);
    }

    private static void consumerPractice() {

        Consumer<String> printName =
                name -> System.out.println("Hello, " + name);

        printName.accept("Samuel");
    }

    private static void supplierPractice() {

        Supplier<String> message =
                () -> "Welcome to Module 6!";

        System.out.println(message.get());
    }

    private static void unaryOperatorPractice() {

        UnaryOperator<Integer> doubleNumber =
                number -> number * 2;

        System.out.println(
                "10 doubled: " + doubleNumber.apply(10)
        );
    }

    private static void binaryOperatorPractice() {

        BinaryOperator<Integer> add =
                (a, b) -> a + b;

        System.out.println(
                "10 + 20 = " + add.apply(10, 20)
        );
    }
}