import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class H_ExtraHints {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 20, 30, 40, 50, 60);
        List<String> mySList = Arrays.asList("10", "20", "30");

        List<Long> numbers = mySList
                .stream()
                .map(Long::valueOf)
                .collect(Collectors.toList());

        //anyMatch
        System.out.println(numbers.stream().anyMatch(nr -> nr % 2 == 0));

        //mapToInt
        List<Integer> integers = myList.stream().mapToInt(e -> e).boxed().collect(Collectors.toUnmodifiableList());
    }
}
