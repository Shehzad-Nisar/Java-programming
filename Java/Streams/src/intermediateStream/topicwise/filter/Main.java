package intermediateStream.topicwise.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    static void main() {

        List<User> users = Arrays.asList(
                new User("Ali",       true,  22, true),
                new User("Ahmed",     true,  17, false),
                new User("Sara",      false, 25, true),
                new User("Ayesha",    true,  30, false),
                new User("Usman",     true,  28, true),
                new User("Hassan",    false, 19, false),
                new User("Fatima",    true,  35, true),
                new User("Bilal",     false, 42, true),
                new User("Zain",      true,  16, false),
                new User("Hira",      true,  24, true),
                new User("Hamza",     false, 31, false),
                new User("Maham",     true,  27, false),
                new User("Omar",      true,  45, true),
                new User("Laiba",     false, 21, true),
                new User("Danish",    true,  33, false),
                new User("Iqra",      false, 29, false),
                new User("Saad",      true,  20, true),
                new User("Maryam",    true,  38, false),
                new User("Talha",     false, 50, true),
                new User("Noor",      true,  26, true)
        );

        System.out.println("LIST OF ACTIVE USERS:");
        List<String> activeUsers = users.stream()
                .filter(n-> n.active)
                .map(user-> user.name)
                .toList();
        System.out.println(activeUsers);


        System.out.println("Adult Users");
        users.stream().filter(n->n.age>=18).forEach(System.out::println);

        System.out.println("Premier User");
        users.stream().filter(n->n.premium).forEach(System.out::println);



    }
}
