public class PersonPractice {

    public static void main(String[] args) {

        // Create a Person object
        Person p1 = new Person("Alice", 21);

        // Call a method on the object
        p1.introduce();

        // Call a method that returns a value
        System.out.println("Age: " + p1.getAge());
    }


    // Person class = blueprint
    static class Person {

        // Fields / data
        private String name;
        private int age;


        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }


        // Method
        public void introduce() {
            System.out.println(
                    "Hi, I am " + name +
                            " and I am " + age + " years old."
            );
        }


        // Getter
        public int getAge() {
            return age;
        }
    }
}