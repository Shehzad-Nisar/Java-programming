package ibuiltFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class User {
    private String name;
    private String email;

    User(String name , String email){
        this.name  = name ;
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
}

public class ConsumerFunc {
    static void main() {

        User u1 = new User("Shehzad Nisar", "shehzadnisar@gamil.com");
        User u2 = new User("Ziaraf Hussain", "ziarafhussain@gamil.com");
        User u3 = new User("Mubashir Abbasi", "mubashirabbasi@gamil.com");
        User u4 = new User("Musharaf hussain", "mushubasho@gamil.com");
        User u5 = new User("Irfan Ali", "irfanali@gamil.com");
        User u6 = new User("Jahangir ali", "jahangir@gamil.com");

        //user list

        List<User> userList = new ArrayList<>();
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);
        userList.add(u5);
        userList.add(u6);

        System.out.println("DETAILS OF "+ userList.size()+ " USERS.");
        userList.forEach(detail-> System.out.println( "User: " + detail.getName()
                + " | Gmail: " + detail.getEmail()));

        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,6);

        arr.forEach((element)-> System.out.println(element*element));


        Predicate<Double> isExpensive = (price) -> price>=22000;
        System.out.println("Is this Mobile expensive: " + isExpensive.test(28000.));











//        Consumer<User> users = (userobj)-> System.out.println("User: "+ userobj.getName() + " | Email: "+ userobj.getEmail());
//
//        users.accept(u1);








//
//        Consumer<String> loggedInfo = info -> System.out.println("status " + info);
//
//        loggedInfo.accept("Logged IN.");
//        loggedInfo.accept("Logged OUT.");






    }
}
