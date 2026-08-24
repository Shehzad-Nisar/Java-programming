package OptionalHasValue;

import java.util.Optional;

public class ValuedOptional {
    static void main() {
        String name = "shehzad nisar";
        //handle by try and catch
        try {
            Optional<String> optionalName = Optional.of(name);
            System.out.println(optionalName);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        int val = 22;

        Optional<Integer> optionalVal = Optional.of(val);
        System.out.println(optionalVal);


    }
}
