import java.util.*;

public class QueueB {

    public static void main(String args[]){

        // queue q = new Queue(5); ---> Arrays
        //  Queue q = new Queue() ; ---> through linkedlist

        // Queue is an interface so we can to use it through Linkedlist object & ArrayDequeue object

        // Queue<Integer> q = new LinkedList<>();

        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
 
}
