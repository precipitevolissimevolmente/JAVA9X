import java.util.PriorityQueue;

public class MaxHeap {
     private PriorityQueue<Integer> queue = new PriorityQueue<>((x,y) -> x < y ? -1 : x == y ? 0 : 1);

    public MaxHeap add(Integer element) {
        queue.add(element);
        return this;
    }
}
