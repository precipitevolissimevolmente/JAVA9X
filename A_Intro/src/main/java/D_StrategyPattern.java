import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class D_StrategyPattern {

    private static int calculate(List<Integer> numbers) {
        return numbers
                .stream()
                .reduce(0, (c, e) -> c + e);
    }

    private static int calculate(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers
                .stream()
                .filter(predicate)
                .reduce(0, (a, b) -> a + b);
    }

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println(calculate(myList));
        System.out.println(calculate(myList, e -> e < 4));
    }
}
