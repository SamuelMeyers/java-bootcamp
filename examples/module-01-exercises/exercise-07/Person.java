public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return name + " is " + age + " years old";
    }

    public static void main(String[] args) {
        Person person = new Person("Aman", 21);

        System.out.println(person.introduce());
    }
}
