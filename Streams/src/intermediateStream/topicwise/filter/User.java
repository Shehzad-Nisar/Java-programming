package intermediateStream.topicwise.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class User {
    String name;
    boolean active ;
    int age ;
    boolean premium;

    public User(String name, boolean active, int age , boolean premium){
        this.name = name ;
        this.active = active;
        this.age = age ;
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", active=" + active +
                ", age=" + age +
                ", premium=" + premium +
                '}';
    }
}
