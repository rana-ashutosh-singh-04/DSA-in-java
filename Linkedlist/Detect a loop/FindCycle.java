import java.util.*;

public class FindCycle {

    public static class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static node head;
    public static node tail;

    public static boolean hasCycle(node head){ //FLOYD's Cycle Finding Algorithms

        if(head==null || head.next==null){
            return false;
        }

        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
             return true;
            }
        }
        
        return false;
    }

    public static void removeCycle(){
        // detect cycle 
        node slow = head;
        node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                cycle = true;
                break;
            }
        }
        if(cycle==false){
            return ;
        }

        // find meeting point 
        slow = head;
        node prev = null; //last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -> last.next = null
        prev.next = null;
    }
    

    public static void main(String[] args) {
        FindCycle ll = new FindCycle();
        //  node head = new node(1);
         head = new node(1);
         head.next = new node(2);
         head.next.next = new node(3);
         head.next.next.next = new node(4);
         head.next.next.next.next = head.next.next; // creating cycle
         System.out.println("is there any cycle ? "+hasCycle(head));
         removeCycle();
         System.out.println("is there any cycle ? "+hasCycle(head));
    }
}