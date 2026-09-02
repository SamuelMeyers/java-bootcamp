public class CompileTimePolymorphism {

    public static void main(String[] args) {

        PracticeCalculator calc = new PracticeCalculator();

        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10.5, 20.5));
        System.out.println(calc.add(10, 20, 30));
    }
}

class PracticeCalculator {

    // Version 1
    int add(int a, int b) {
        return a + b;
    }

    // Version 2
    double add(double a, double b) {
        return a + b;
    }

    // Version 3
    int add(int a, int b, int c) {
        return a + b + c;
    }
}