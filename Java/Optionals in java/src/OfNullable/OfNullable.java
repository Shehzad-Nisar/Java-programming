package OfNullable;

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
        Optional<String> optionalS3 = Optional.ofNullable("mushahid hussain");
        System.out.println(optionalS);
        System.out.println("Does optionalS contain value: " + optionalS.isPresent());
        System.out.println("Does optionalS contain null value: " + optionalS.isEmpty());
        System.out.println(optionalS2);
        System.out.println("Does optionalS2 contain value: " + optionalS2.isPresent());
        System.out.println("Does optionalS2 contain null value: " + optionalS2.isEmpty());

        System.out.println(optionalS3);
        System.out.println("Does optionalS3 contain value: " + optionalS3.isPresent());
        System.out.println("Does optionalS3 contain null value: " + optionalS3.isEmpty());




        System.out.println("Calling method which may or mabe return null.");
        System.out.println(getSecondaryNum(1051));
        System.out.println(getSecondaryNum(101));
    }
}
