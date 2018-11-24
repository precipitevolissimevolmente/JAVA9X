import java.util.ArrayList;
import java.util.List;

public class MainC {
    public static void main(String[] args) {
        String a1 = "abcS";
        String a2 = "abcS";
        System.out.println(System.identityHashCode(a1));
        System.out.println(System.identityHashCode(a2));

        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

        String r1 = new String("abcS");
        String r2 = new String("abcS");
        System.out.println(System.identityHashCode(r2));

        System.out.println(r1 == r2);
        System.out.println(r1.equals(r2));


//        try (MyResource myResource = new MyResource()) {
//            myResource.doSome();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}