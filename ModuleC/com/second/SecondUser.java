package second;

import user.FibonacciProvider;

public class SecondUser {
    public static void main(String[] args) {
        FibonacciProvider provider = new FibonacciProvider();
        Object obj = provider.getFibonacci();
        System.out.println(obj);

        //todo
//        util.Fibonacci fibonacci = firstUser.getFibonacci();
//        fibonacci.fib(10);
    }
}