import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class I_OptionalJ9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> first = numbers.stream()
                .filter(nr -> nr > 8)
                .findFirst();

        //Java 8
        if (first.isPresent()) {
            System.out.println(first.get());
        } else {
            System.out.println("nothing");
        }

        //Java 9+
//        first.ifPresentOrElse(System.out::println, () -> System.out.println("nothing"));

//        Optional<Integer> or = numbers.stream()
//                .filter(nr -> nr > 80)
//                .findFirst()
//                .or(() -> Optional.of(100));
//        System.out.println(or);

//        System.out.println("Optional Iterate:");
//        Optional.of(10).stream().forEach(System.out::println);
    }
}
