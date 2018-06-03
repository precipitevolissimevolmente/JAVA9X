package user;

import util.Fibonacci;
import util.Helper;

public class FibonacciProvider {

    public Fibonacci getFibonacci() {
        return new Fibonacci();
    }

    public void call() {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Fib 10 = " + fibonacci.fib(10));

        Helper helper = fibonacci.getHelper();
        System.out.println("Helper instance: " + helper);

        //todo
//        impl.HelperImpl helper1 = null;
        //todo
//        try {
//            java.lang.reflect.Method method = helper.getClass().getMethod("hidden");
//            System.out.println(method);
//            method.invoke(helper);
//        } catch (Exception ex) {
//            System.out.println("Error: " + ex.getMessage());
//        }
    }
}