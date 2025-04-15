package ArrayListUsage;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        // Adding students
        students.add(new Student("Nisha", 1, "Math"));
        students.add(new Student("Pemba G", 0, "Science"));
        students.add(new Student("Pemba G", 0, "Science")); // Duplicate, will not be added
        students.add(new Student("Mingma", 3, "null"));


        // Printing details
        System.out.println("Students in HashSet:");
        for (Student s : students) {
            s.PrintDetails();
        }

        // Removing a student (by object, not index)
        Student toRemove = new Student("Pemba G", 0, "Science");
        students.remove(toRemove); // Works now because of equals() and hashCode()

        System.out.println("\nAfter Removing Pemba G:");
        for (Student s : students) {
            s.PrintDetails();
        }
    }
}
