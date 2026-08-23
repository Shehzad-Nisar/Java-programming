package intermediateStream.topicwise.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class User {
    String name;
    String email;
    int age ;

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}

class UserResponse {
    String name;
    String email;

    UserResponse(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


class UserMain{
    public static void main() {
        List<User> users = Arrays.asList(
                new User("Ali", "ali@gmail.com", 22),
                new User("Ahmed", "ahmed@gmail.com", 25),
                new User("Sara", "sara@gmail.com", 21),
                new User("Ayesha", "ayesha@gmail.com", 28),
                new User("Usman", "usman@gmail.com", 30),
                new User("Hassan", "hassan@gmail.com", 19),
                new User("Fatima", "fatima@gmail.com", 26),
                new User("Bilal", "bilal@gmail.com", 24),
                new User("Hira", "hira@gmail.com", 23),
                new User("Hamza", "hamza@gmail.com", 32)
        );


        List<UserResponse> userResponsesList = users.stream()
                .map(user -> new UserResponse(user.name,user.email))
                .toList();
        userResponsesList.forEach(System.out::println);


    }




}
