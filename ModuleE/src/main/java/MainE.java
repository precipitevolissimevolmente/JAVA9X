import java.util.ArrayList;
import java.util.List;

public class MainE {
    public static void main(String[] args) {

        MinMaxHeap heap = new MinMaxHeap();
        heap.add(35);
        heap.add(33);
        heap.add(42);
        heap.add(10);
        heap.add(14);
        heap.add(19);
        heap.add(27);
        heap.add(44);
        heap.add(26);
        heap.add(31);

        System.out.println(heap.getMaxHeap());
        System.out.println(heap.getMinHeap());

        //        String a1 = "abcS";
//        String a2 = "abcS";
//        System.out.println(System.identityHashCode(a1));
//        System.out.println(System.identityHashCode(a2));
//
//        System.out.println(a1 == a2);
//        System.out.println(a1.equals(a2));
//
//        String r1 = new String("abcS");
//        String r2 = new String("abcS");
//        System.out.println(System.identityHashCode(r2));
//
//        System.out.println(r1 == r2);
//        System.out.println(r1.equals(r2));


//        try (MyResource myResource = new MyResource()) {
//            myResource.doSome();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}