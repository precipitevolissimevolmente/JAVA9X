import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class G_FilterSkipLimit {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2, 7, 88, 44, 3, 56, 9, 0);

        List<Integer> gt40 = myList
                .stream()
                .filter(integer -> integer > 40)
                .collect(Collectors.toList());
        System.out.println(gt40);

        //JAVA 10
        //todo toUnmodifiableList
        //todo skip some elements


        //todo Print numbers from 0 to 5
        //JAVA 7
//        for (int i = 0; i <= 5; i = i + 2) {
//            System.out.print(i);
//        }
//        System.out.println("\n---------------------------------------------------------");
//
//        //JAVA 8
//        IntStream.rangeClosed(0, 5)
//                .forEach(System.out::print);
//
//        System.out.println("\n---------------------------------------------------------");
//
//        IntStream.iterate(0, i -> i+2)
//                .limit(3)
//                .forEach(System.out::print);
//        System.out.println("\n---------------------------------------------------------");
//
//        //JAVA 9+
//        IntStream.iterate(0, i -> i <=5, i -> i+2)
//                .forEach(System.out::print);
//
//        System.out.println("\n---------------------------------------------------------");

    }
}