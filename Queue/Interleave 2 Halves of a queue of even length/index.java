import java.util.*;

public class index{

    public static void interleave(Queue q){

       int size = q.size();
       Queue first = new LinkedList();
       for(int i=0; i<size/2; i++){
        first.add(q.remove());
       }

       while (!first.isEmpty()) {
        q.add(first.remove());
        q.add(q.remove());
       }

    }
    public static void main(String[] args) {
        Queue q = new LinkedList<>();

        for(int i=0; i<10; i++){
            q.add(i+1);
        }
        
        interleave(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
    }
}