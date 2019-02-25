public class A_TryWithResource {
    public static void main(String[] args) {
        tryWithResource();
    }

    private static void tryWithResource() {
        try (MyResource myResource = new MyResource()) {
            System.out.println("do something");
        }
    }
}
