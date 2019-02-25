import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static java.lang.Thread.sleep;

public class F_ParallelStream {

    private static Integer calculate(Stream<Integer> numbers) {
        return numbers
                .filter(F_ParallelStream::isMagic)
                .reduce(0, (c, e) -> c + e);
    }

    private static boolean isMagic(int nr) {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 20, 30, 40, 50);
        //add all magic numbers

        long start = System.nanoTime();
        //todo: try parallel stream
        System.out.println(calculate(myList.stream()));
        long duration = TimeUnit.SECONDS.convert(System.nanoTime() - start, TimeUnit.NANOSECONDS);
        System.out.println(String.format("Elapsed: %d seconds", duration));
    }
}
