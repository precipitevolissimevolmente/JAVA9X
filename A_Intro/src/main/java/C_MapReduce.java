import java.util.Arrays;
import java.util.List;

public class C_MapReduce {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 20, 30, 40, 50, 60);

        //Mutable Code
        int total = 0;
        for (Integer element : myList) {
            total += element * 2;
        }
        System.out.println(total);

        //Immutable
        System.out.println(myList
                .stream()
                .map(element -> element * 2)
                .reduce(0, (c, e) -> c + e));

    }
}

//reference