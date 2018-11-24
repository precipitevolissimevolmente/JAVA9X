import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MinMaxHeap {
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x, y) -> x < y ? -1 : x.equals(y) ? 0 : 1);
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>((x, y) -> x > y ? -1 : x.equals(y) ? 0 : 1);

    public MinMaxHeap add(int element) {
        maxHeap.add(element);
        minHeap.add(element);
        return this;
    }

    public List<Integer> getMaxHeap() {
        return toList(maxHeap);
    }

    public List<Integer> getMinHeap() {
        return toList(minHeap);
    }

    private List<Integer> toList(PriorityQueue<Integer> heap) {
        List<Integer> l = new ArrayList<>();
        while (!heap.isEmpty()) {
            l.add(heap.poll());
        }
        return l;
    }
}