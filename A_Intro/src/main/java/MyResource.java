public class MyResource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Cleanup!");
    }
}
