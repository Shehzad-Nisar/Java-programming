package methodRef;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class MethodRefDemo {

    static void main() {

        List<String> names = Arrays.asList("ali","hammad","Qazi","Haroon");

//        System.out.println("Simple For loop:");
//        for(int i = 0 ; i<names.size(); i++){
//            System.out.println(names.get(i));
//        }
//
//        System.out.println("Enhanced for loop:");
//        for(String name: names){
//            System.out.println(name);
//        }
//
//        System.out.println("ForEach method");
//        names.forEach(name-> System.out.println(name));
//
//        System.out.println("Method Reference:\n");
//        names.forEach(System.out::println);

        Function<String , String > name =  String::toUpperCase;

        String myName = name.apply("shehzad nisar");
        System.out.println(myName);






    }
}
