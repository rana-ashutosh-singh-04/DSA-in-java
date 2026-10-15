import java.util.*;

public class usePriorityQueue {
 
    public static void main(String[] args) {
        
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        
        // peek() => see the first top element of the pq
        System.out.println(pq.peek());
        System.out.println(pq);
        while(!pq.isEmpty()){
            // remove() => remove the top element in the pq
            System.out.println(pq.remove());
        }
        
    }
}
