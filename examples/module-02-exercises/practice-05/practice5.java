public class practice5 {

    public static void main(String[] args) {

        int age = 20;
        double salary = 55000;

        int id1 = 101;
        int id2 = 102;

        String name1 = new String("Alex");
        String name2 = new String("Alice");


        if (age >= 18) {
            registerEmployee();
        }


        if (salary > 50000) {
            calculateTax();
        }


        if (id1 != id2) {
            createNewRecord();
        }


        if (name1 == name2) {
            System.out.println("== says the names match.");
        } else {
            System.out.println("== says the names do NOT match.");
        }


        if (name1.equals(name2)) {
            System.out.println(".equals() says the names match.");
        } else {
            System.out.println(".equals() says the names do NOT match.");
        }
    }


    public static void registerEmployee() {
        System.out.println("Employee registered.");
    }


    public static void calculateTax() {
        System.out.println("Tax calculation applied.");
    }


    public static void createNewRecord() {
        System.out.println("New employee record created.");
    }
}