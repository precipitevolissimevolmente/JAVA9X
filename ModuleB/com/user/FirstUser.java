package user;

import util.Fibonacci;
import util.Helper;

public class FirstUser {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(10));

        Helper helper = fibonacci.getHelper();
        System.out.println(helper);

        //todo
//        impl.HelperImpl helper1 = null;
        //todo
        try {
            java.lang.reflect.Method method = helper.getClass().getMethod("hidden");
            System.out.println(method);
            method.invoke(helper);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public Fibonacci getFibonacci() {
        return new Fibonacci();
    }
}