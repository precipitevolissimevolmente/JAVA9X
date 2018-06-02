package util;

import impl.HelperImpl;

public class Fibonacci {
    public int fib(int number) {
        return number < 2 ?
                1:
                fib(number - 1) + fib(number - 2);
    }

    public HelperImpl getHelper() {
        return new HelperImpl();
    }
}
