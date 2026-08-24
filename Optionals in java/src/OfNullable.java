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

        Optional<String> optionalS = Optional.of("kazim");
        Optional<String> optionalS2 = Optional.empty();
        Optional<String> optionalS3 = Optional.ofNullable(null);
        System.out.println(optionalS);
        System.out.println(optionalS2);
        System.out.println(optionalS3);


        System.out.println("Calling method which may or mabe return null.");
        System.out.println(getSecondaryNum(1051));
        System.out.println(getSecondaryNum(101));
    }
}
