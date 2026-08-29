package maps;

import java.util.HashMap;
import java.util.Map;

public class UserObjs {
    static void main() {
        User ali = new User("Ali Ahmed", "aliahmedgmail.com");
        User ahmed = new User("Ahmed Khan", "ahmedkhangmail.com");
        User Qaim = new User("Qaim ali", "qaimaligmail.com");
        User Qasim = new User("M Qasim", "qasim08gmail.com");
        User Zaid = new User("Zaid Yousaf", "zaidyousafgmail.com");

        Map<String, User> sessions = new HashMap<>();
        sessions.put("abc334", ali);
        sessions.put("acf334", ahmed);
        sessions.put("acd334", Qaim);
        sessions.put("xyi334", Qasim);
        sessions.put("ddf334", Zaid);

        User user = sessions.get("acf334");
        for (Map.Entry<String , User> entry: sessions.entrySet()){
            System.out.println("Session ID: "+ entry.getKey() + " Value : "+ entry.getValue().name);
        }

    }

}
