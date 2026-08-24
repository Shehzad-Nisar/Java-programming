package safeWayToRetrieveOptionals;

import java.util.Optional;

public class SafeWay {

    static String getName(){
        System.out.println("already executed");
        return "Guest.";
    }
    static void main() {
        String name = "babar ali";



        Optional<String> optionalS = Optional.of(name);
        Optional<String> optionalS2 = Optional.ofNullable("shehzad");
        Optional<String> optionalS3 = Optional.empty();

        System.out.println("+------orElse()-----+");

        System.out.println(optionalS.orElse("default"));
        System.out.println(optionalS2.orElse("default"));
        System.out.println(optionalS3.orElse("default"));
        //--------------orElseGet():
//
//        System.out.println(optionalS.orElseGet(()->"empty optional"));
//        System.out.println(optionalS3.orElseGet(()->"empty optional"));
        //if we evaluate a callback in orElse() then it always runs first then check the else :
        System.out.println("+------orElseGet()-----+");
        String result = optionalS.orElse(getName());
        System.out.println(result);
        System.out.println(optionalS.orElseGet(()-> getName()));
        System.out.println(optionalS3.orElseGet(()-> getName()));
        System.out.println("+------orElseThrow()-----+");
        System.out.println(optionalS.orElseThrow());
        System.out.println(optionalS2.orElseThrow());
        try {
            String result2 = optionalS3.orElseThrow(() -> new RuntimeException("User not found"));
            System.out.println(result2);

        }catch (RuntimeException e){
            System.out.println("Error: " + e.getMessage());

        }

        System.out.println("run");

    }
}
