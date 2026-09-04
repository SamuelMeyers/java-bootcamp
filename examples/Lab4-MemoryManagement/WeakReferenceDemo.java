import java.lang.ref.WeakReference;

public class WeakReferenceDemo {

    public static void main(String[] args) {
        System.out.println("===== Weak Reference Demonstration =====");

        System.out.println("--- Strong Reference ---");

        Person strongPerson = new Person("Strong User", 40);

        System.out.println("Before GC : " + strongPerson);

        MemoryMonitor.triggerGarbageCollection();

        System.out.println("After GC  : " + strongPerson);

        System.out.println(
                "Object remains because a strong reference still exists."
        );

        System.out.println();
        System.out.println("--- Weak Reference ---");

        Person weakTarget = new Person("Weak User", 30);

        WeakReference<Person> weakPerson =
                new WeakReference<>(weakTarget);

        System.out.println(
                "Before GC : " + weakPerson.get()
        );

        weakTarget = null;

        MemoryMonitor.triggerGarbageCollection();

        System.out.println(
                "After GC  : " + weakPerson.get()
        );

        System.out.println(
                "The weakly referenced object may be garbage collected."
        );
    }
}
