package user;

public class FirstUser {
    public static void main(String[] args) {
        System.out.println("Running FirstUser from ModuleB");

        FibonacciProvider provider = new FibonacciProvider();
        provider.call();
    }
}