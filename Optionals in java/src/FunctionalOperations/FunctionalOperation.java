package FunctionalOperations;

import java.util.Optional;

public class FunctionalOperation {
    static Optional<String> user1 = Optional.of("zeeshan haider");
    static Optional<String>  user2 = Optional.empty();

    static void main() {

        System.out.println("+------ifPresent------+");
        user1.ifPresent((value)-> System.out.println(value) );
        user2.ifPresent((value)-> System.out.println(value) );
        System.out.println("+------map()------+");
        Optional<String> upperCaseName= user1.map(String::toUpperCase);
        System.out.println(upperCaseName.orElse("default"));
        Optional<String> upperCaseName2= user2.map(String::toUpperCase);
        System.out.println(upperCaseName2.orElse("default"));


    }
}
