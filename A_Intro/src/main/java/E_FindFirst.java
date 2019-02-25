import java.util.Arrays;
import java.util.List;

public class E_FindFirst {
    private static Integer calculate(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(E_FindFirst::multiply)
                .findFirst().orElse(0);
    }

    private static int multiply(int nr) {
        System.out.println("Fost pe aici");
        return nr * 2;
    }

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 3, 7, 10);
        //return the double of the first even number
        Integer result = calculate(myList);

        System.out.println(result);
    }
}
