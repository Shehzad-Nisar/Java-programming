import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Main{
    static void main() {

        List<Integer> num =Arrays.asList(1,2,4,5,6,2,18,15,33,44,77);

//        int invalid = num.stream().filter(n-> n>=15);

//        List<Integer> validList = num.stream().filter(nm-> nm>=15)
//                .toList();
//        System.out.println(validList);
//
//        Stream<Integer> stream = num.stream();
//        List<Integer> Invalid = stream.filter(n->n<15).toList();
//        System.out.println(Invalid);
//
      int[] numbers = {11,222,34,55,65,76,24,68,35,75};


        int[] evenNumbers = Arrays.stream(numbers)
                .filter( n-> n % 2 == 0)
                .toArray();

        System.out.println((evenNumbers));



    }

}