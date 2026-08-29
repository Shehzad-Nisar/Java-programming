package ibuiltFunctions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class IbuiltFunc {



    static void main() {
        Predicate<Integer> isAdult = (age) -> age>=18;
        System.out.println(isAdult.test(22));


        Function<Integer,Integer> subtraction = (a)-> a*a;
        System.out.println(subtraction.apply(20));


        Consumer<Double> printTransaction = (amount)-> System.out.println("Transaction amount : " + amount);
        printTransaction.accept(4000.);

    }


}
