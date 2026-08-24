package OptionalHasValue;

import java.util.Optional;

public class Practice {

    public static Optional<String> getAccNum(int id){
        String accNum = "pk221jh4kl";

        if(id==1){
            return Optional.of(accNum);
        }

        return Optional.empty();

    };

    static void main() {
        System.out.println(getAccNum(12));
    }
}
