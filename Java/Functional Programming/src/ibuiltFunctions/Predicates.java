package ibuiltFunctions;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Predicates {
    static void main() {



        Predicate<String> isValidEmail = (email)-> email.contains("@gmail.com");
        System.out.println( isValidEmail.test("shehzadnisar@gmail.com"));;
        System.out.println(isValidEmail.test("shehzadnisargmail.com"));;
        System.out.println(isValidEmail.test("shehzadnisar@gmailcom"));;
        System.out.println(isValidEmail.test("shehzadnisar@gmail.com"));;



    }
}
