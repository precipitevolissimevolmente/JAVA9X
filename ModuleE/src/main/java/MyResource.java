public class MyResource implements AutoCloseable {

    public void doSome() {
        System.out.println("working");
        int index = 0;
        int count = 3;
        System.out.println(">" + ++index % count);
        System.out.println(">" + ++index % count);
        System.out.println(">" + ++index % count);
    }

    @Override
    public void close() throws Exception {
        System.out.println("cleaning....");
    }
}
