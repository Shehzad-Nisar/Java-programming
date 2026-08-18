package sets;

import java.util.HashSet;
import java.util.Set;

public class Main {

    static void main() {
        Student s1 = new Student("Mubashir Abbasi",24);
        Student s2 = new Student("Mubashir Abbasi",2f4);

        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);

        System.out.println(s1.equals(s2));

    }
}
