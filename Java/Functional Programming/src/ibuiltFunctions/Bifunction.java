package ibuiltFunctions;

import java.util.function.BiFunction;

public class Bifunction {
    
    public static BiFunction<Integer, Integer,Integer> addFunc =
            (a,b)-> a+b;

    public static BiFunction<Integer,Integer,Integer> subFunc = (a,b)-> a-b;



    public static BiFunction<String ,String,String> fullName = (first , last )->first + " " + last;


    

    public static void main() {
        System.out.println("Sum of a and b: " + addFunc.apply(2,3));

        Bifunction ob = new Bifunction();
        System.out.println("Sub of a and b: " + ob.subFunc.apply(20,5));;



        System.out.println(fullName.apply("Shehzad", "Nisar"));
        
    }



}
