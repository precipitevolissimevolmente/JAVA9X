package second;

import user.FirstUser;

public class SecondUser {
    public static void main(String[] args) {
        FirstUser firstUser = new FirstUser();
        Object obj = firstUser.getFibonacci();
        System.out.println(obj);

        //todo
//        util.Fibonacci fibonacci = firstUser.getFibonacci();
//        fibonacci.fib(10);
    }
}