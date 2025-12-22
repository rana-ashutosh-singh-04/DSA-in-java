import java.util.*;

public class QueueB{
    static class node{
        int data ;
        node next; 
        public node(int data){
            this.data = data;
            this.next = null;
        }
    }

    
    static class queue {
        
        static node head = null;
        static node tail = null;
         public boolean isEmpty(){
            return head==null && tail == null;
        }

        // add
        public  void add(int data){
            node newNode = new node(data);
            if(head==null){
                head=tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // Remove
        public  int remove(){
           if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
           }

           int front = head.data;

          //    single element
          if (tail==head) {
               tail = head = null;
            }
            else{
                head = head.next;
            }
            return front;

        }

        // peek
        public  int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;
        }
    }
       
    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}