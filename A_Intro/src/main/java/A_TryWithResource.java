public class A_TryWithResource {
    public static void main(String[] args) {
        tryWithResource();
    }

    private static void tryWithResource() {
        MyResource myResource = new MyResource();
        try (myResource) {
            System.out.println("do something");
        }
    }
}
