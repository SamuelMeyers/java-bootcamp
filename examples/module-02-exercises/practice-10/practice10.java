public class practice10 {

    public static void main(String[] args) {

        // EXAMPLE 1 - PARAMETERS + RETURN

        int result = add(10, 5);

        System.out.println("Result: " + result);


        // EXAMPLE 2 - VOID RETURN

        greet("Alice");

        // EXAMPLE 3 - RETURNING AN OBJECT

        PracticeEmployee employee = createEmployee("Bob", 75000.00);

        System.out.println("Employee name: " + employee.name);
        System.out.println("Employee salary: " + employee.salary);
    }

    // METHOD 1 - PARAMETERS + RETURN

    static int add(int a, int b) {
        return a + b;
    }

    // METHOD 2 - VOID

    static void greet(String name) {
        System.out.println("Hi " + name);
    }


    // METHOD 3 - RETURN AN OBJECT

    static PracticeEmployee createEmployee(String name, double salary) {
        return new PracticeEmployee(name, salary);
    }
}


// Employee class for this practice
class PracticeEmployee {

    String name;
    double salary;

    PracticeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}