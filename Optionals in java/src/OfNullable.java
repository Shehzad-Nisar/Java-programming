import java.util.Optional;

public class OfNullable {

    static Optional<String> getSecondaryNum(int id){
        String secondNum=null;
        if(id==101){
            secondNum = "03443380292";

        }
        return Optional.ofNullable(secondNum);

    }

    static void main() {
        System.out.println(getSecondaryNum(1051));
    }
}
