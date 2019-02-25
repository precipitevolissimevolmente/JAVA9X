import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class J_TakeWhile {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2, 7, 88, 44, 3, 56, 9, 0);
        List<Integer> result = myList.stream()
//                .takeWhile(i -> i < 40)
//                .dropWhile(i -> i < 40)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}