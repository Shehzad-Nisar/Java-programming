import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Streams {


    static void main() {

        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8);

         Function<Integer, Integer> f1 =  n-> n*n;


        Stream<Integer> stream1 = num.stream();

        Stream<Integer> stream2 = stream1.map(f1);

        List<Integer> multiplied = stream2.toList();

//        Stream<Integer> stream3 = num.stream();
//        stream3.forEach(System.out::println);

        System.out.println("Using stream: " + multiplied);



    }
}
