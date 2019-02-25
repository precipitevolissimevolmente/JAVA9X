import java.util.ArrayList;
import java.util.List;

public class A_List {
    public static void main(String[] args) {
        //Init a list
        List<Object> emptyList = List.of();
        System.out.println(emptyList.getClass());

        List<Integer> oneElementList = List.of(10, 11);
        System.out.println(oneElementList.getClass());

        List<Integer> nList = List.of(10, 20, 30, 10, 20, 30, 10, 20, 30, 10, 20, 30, 10, 20, 30, 10, 20, 30, 10, 20);
        System.out.println(nList.getClass());

        ArrayList<Integer> mutableList = new ArrayList<>();
        mutableList.add(10);
        List<Integer> copyOf = List.copyOf(mutableList);
        System.out.println(copyOf.getClass());
    }
}
