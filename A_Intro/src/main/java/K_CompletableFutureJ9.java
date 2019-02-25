import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class K_CompletableFutureJ9 {

    private static int doSomething(int a, int b) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("working...");
        return a + b;
    }

    public static void main(String[] args) throws InterruptedException {
        //JAVA 8
        CompletableFuture<Integer> future = CompletableFuture
                .supplyAsync(() -> doSomething(10, 5));
//        future.thenAccept(System.out::println);

//        CompletableFuture<Integer> copy = future.copy();
//        copy.thenAccept(System.out::println);

        //JAVA 9
//        future.completeOnTimeout(-1,1, TimeUnit.SECONDS)
//              .thenAccept(System.out::println);

        future.orTimeout(1, TimeUnit.SECONDS);
        Thread.sleep(5000);
    }

}